public class ManipuladorDeposito implements ManipuladorDeTransacao {
    private ManipuladorDeTransacao proximoManipulador;

    @Override
    public void setProximoManipulador(ManipuladorDeTransacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void processarTransacao(Transacao transacao) {
        if (transacao.getTipo() == Transacao.Tipo.DEPOSITO) {
            if (transacao.getValor() > 0) {
                transacao.getContaOrigem().depositar(transacao.getValor());
                System.out.println("Depósito de " + transacao.getValor() + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        } else if (proximoManipulador != null) {
            proximoManipulador.processarTransacao(transacao);
        }
    }
}
