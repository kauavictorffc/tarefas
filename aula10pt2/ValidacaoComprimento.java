public class ValidacaoComprimento implements ManipuladorDeValidacao {
    private ManipuladorDeValidacao proximoManipulador;

    @Override
    public void setProximoManipulador(ManipuladorDeValidacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public boolean validar(String login, String senha) {
        if (senha.length() >= 8 && senha.length() <= 16) {
            if (proximoManipulador != null) {
                return proximoManipulador.validar(login, senha);
            }
            return true;
        } else {
            System.out.println("A senha deve ter entre 8 e 16 caracteres.");
            return false;
        }
    }
}
