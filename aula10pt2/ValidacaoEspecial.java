import java.util.regex.Pattern;

public class ValidacaoEspecial implements ManipuladorDeValidacao {
    private ManipuladorDeValidacao proximoManipulador;
    private static final Pattern PADRAO_ESPECIAL = Pattern.compile("[@#$%&*]");

    @Override
    public void setProximoManipulador(ManipuladorDeValidacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public boolean validar(String login, String senha) {
        if (PADRAO_ESPECIAL.matcher(senha).find()) {
            if (proximoManipulador != null) {
                return proximoManipulador.validar(login, senha);
            }
            return true;
        } else {
            System.out.println("A senha deve conter pelo menos um caractere especial.");
            return false;
        }
    }
}
