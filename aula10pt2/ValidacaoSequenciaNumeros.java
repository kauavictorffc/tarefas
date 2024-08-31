public class ValidacaoSequenciaNumeros implements ManipuladorDeValidacao {
    private ManipuladorDeValidacao proximoManipulador;

    @Override
    public void setProximoManipulador(ManipuladorDeValidacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public boolean validar(String login, String senha) {
        if (!senha.matches(".*\\d{3}.*")) {
            if (proximoManipulador != null) {
                return proximoManipulador.validar(login, senha);
            }
            return true;
        } else {
            System.out.println("A senha não deve conter três números consecutivos.");
            return false;
        }
    }
}
