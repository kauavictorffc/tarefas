public class Cliente {
    public static void main(String[] args) {
        // Criação de contas bancárias
        ContaBancaria conta1 = new ContaBancaria("123", 1000);
        ContaBancaria conta2 = new ContaBancaria("456", 500);

        // Criação de manipuladores
        ManipuladorDeTransacao manipuladorDeposito = new ManipuladorDeposito();
        ManipuladorDeTransacao manipuladorSaque = new ManipuladorSaque();
        ManipuladorDeTransacao manipuladorTransferencia = new ManipuladorTransferencia();

        // Configuração da cadeia de responsabilidade
        manipuladorDeposito.setProximoManipulador(manipuladorSaque);
        manipuladorSaque.setProximoManipulador(manipuladorTransferencia);

        // Processamento de transações
        Transacao deposito = new Transacao(Transacao.Tipo.DEPOSITO, 200, conta1, null);
        Transacao saque = new Transacao(Transacao.Tipo.SAQUE, 100, conta1, null);
        Transacao transferencia = new Transacao(Transacao.Tipo.TRANSFERENCIA, 150, conta1, conta2);
        Transacao transacaoInvalida = new Transacao(Transacao.Tipo.DEPOSITO, -50, conta1, null);

        manipuladorDeposito.processarTransacao(deposito);
        manipuladorDeposito.processarTransacao(saque);
        manipuladorDeposito.processarTransacao(transferencia);
        manipuladorDeposito.processarTransacao(transacaoInvalida);
    }
}
