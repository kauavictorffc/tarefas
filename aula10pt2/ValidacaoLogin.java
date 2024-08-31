import java.util.Set;

public class ValidacaoLogin implements ManipuladorDeValidacao {
    private ManipuladorDeValidacao proximoManipulador;
    private Set<String> loginsCadastrados;

    public ValidacaoLogin(Set<String> loginsCadastrados) {
        this.loginsCadastrados = loginsCadastrados;
    }

    @Override
    public void setProximoManipulador(ManipuladorDeValidacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public boolean validar(String login, String senha) {
        if (loginsCadastrados.contains(login)) {
            if (proximoManipulador != null) {
                return proximoManipulador.validar(login, senha);
            }
            return true;
        } else {
            System.out.println("Login não cadastrado.");
            return false;
        }
    }
}
