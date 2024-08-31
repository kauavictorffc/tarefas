public class ValidacaoNumero implements ManipuladorDeValidacao {
    private ManipuladorDeValidacao proximoManipulador;

    @Override
    public void setProximoManipulador(ManipuladorDeValidacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public boolean validar(String login, String senha) {
        if (senha.chars().anyMatch(Character::isDigit)) {
            if (proximoManipulador != null) {
                return proximoManipulador.validar(login, senha);
            }
            return true;
        } else {
            System.out.println("A senha deve conter pelo menos um número.");
            return false;
        }
    }
}
