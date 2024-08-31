public class ManipuladorTransferencia implements ManipuladorDeTransacao {
    private ManipuladorDeTransacao proximoManipulador;

    @Override
    public void setProximoManipulador(ManipuladorDeTransacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void processarTransacao(Transacao transacao) {
        if (transacao.getTipo() == Transacao.Tipo.TRANSFERENCIA) {
            if (transacao.getValor() > 0 &&
                transacao.getContaOrigem().getSaldo() >= transacao.getValor()) {
                transacao.getContaOrigem().transferir(transacao.getContaDestino(), transacao.getValor());
                System.out.println("Transferência de " + transacao.getValor() + " realizada com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para transferência.");
            }
        } else if (proximoManipulador != null) {
            proximoManipulador.processarTransacao(transacao);
        }
    }
}
