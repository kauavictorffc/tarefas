public class ManipuladorSaque implements ManipuladorDeTransacao {
    private ManipuladorDeTransacao proximoManipulador;

    @Override
    public void setProximoManipulador(ManipuladorDeTransacao proximoManipulador) {
        this.proximoManipulador = proximoManipulador;
    }

    @Override
    public void processarTransacao(Transacao transacao) {
        if (transacao.getTipo() == Transacao.Tipo.SAQUE) {
            if (transacao.getValor() > 0 && transacao.getContaOrigem().getSaldo() >= transacao.getValor()) {
                transacao.getContaOrigem().sacar(transacao.getValor());
                System.out.println("Saque de " + transacao.getValor() + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido para saque.");
            }
        } else if (proximoManipulador != null) {
            proximoManipulador.processarTransacao(transacao);
        }
    }
}
