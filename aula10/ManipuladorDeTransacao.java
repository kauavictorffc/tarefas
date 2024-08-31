public interface ManipuladorDeTransacao {
    void setProximoManipulador(ManipuladorDeTransacao proximoManipulador);
    void processarTransacao(Transacao transacao);
}
