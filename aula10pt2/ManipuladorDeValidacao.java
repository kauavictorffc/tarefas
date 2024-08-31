public interface ManipuladorDeValidacao {
    void setProximoManipulador(ManipuladorDeValidacao proximoManipulador);
    boolean validar(String login, String senha);
}
