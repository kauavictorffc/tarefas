import java.util.Set;
import java.util.HashSet;

public class Cliente {
    public static void main(String[] args) {
        // Logins cadastrados
        Set<String> loginsCadastrados = new HashSet<>();
        loginsCadastrados.add("usuario1");
        loginsCadastrados.add("usuario2");
        loginsCadastrados.add("usuario3");

        // Criação de manipuladores
        ManipuladorDeValidacao validacaoLogin = new ValidacaoLogin(loginsCadastrados);
        ManipuladorDeValidacao validacaoMaiusculo = new ValidacaoMaiusculo();
        ManipuladorDeValidacao validacaoMinusculo = new ValidacaoMinusculo();
        ManipuladorDeValidacao validacaoEspecial = new ValidacaoEspecial();
        ManipuladorDeValidacao validacaoNumero = new ValidacaoNumero();
        ManipuladorDeValidacao validacaoSequenciaNumeros = new ValidacaoSequenciaNumeros();
        ManipuladorDeValidacao validacaoComprimento = new ValidacaoComprimento();

        // Configuração da cadeia de responsabilidade
        validacaoLogin.setProximoManipulador(validacaoMaiusculo);
        validacaoMaiusculo.setProximoManipulador(validacaoMinusculo);
        validacaoMinusculo.setProximoManipulador(validacaoEspecial);
        validacaoEspecial.setProximoManipulador(validacaoNumero);
        validacaoNumero.setProximoManipulador(validacaoSequenciaNumeros);
        validacaoSequenciaNumeros.setProximoManipulador(validacaoComprimento);

        // Exemplos de validação
        validarTransacao(validacaoLogin, "usuario1", "Senha@123");
        validarTransacao(validacaoLogin, "usuario1", "senha@123");
        validarTransacao(validacaoLogin, "usuario1", "S3nh@");
        validarTransacao(validacaoLogin, "usuarioX", "Senha@123");
        validarTransacao(validacaoLogin, "usuario1", "Senha123456789012345");
    }

    private static void validarTransacao(ManipuladorDeValidacao validacao, String login, String senha) {
        boolean resultado = validacao.validar(login, senha);
        if (resultado) {
            System.out.println("Login e senha são válidos.");
        } else {
            System.out.println("Login ou senha inválidos.");
        }
    }
}
