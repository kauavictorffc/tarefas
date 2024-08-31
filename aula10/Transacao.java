public class Transacao {
    public enum Tipo { DEPOSITO, SAQUE, TRANSFERENCIA }
    
    private Tipo tipo;
    private double valor;
    private ContaBancaria contaOrigem;
    private ContaBancaria contaDestino;

    // Construtor
    public Transacao(Tipo tipo, double valor, ContaBancaria contaOrigem, ContaBancaria contaDestino) {
        this.tipo = tipo;
        this.valor = valor;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    // Getters e Setters
    public Tipo getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public ContaBancaria getContaOrigem() {
        return contaOrigem;
    }

    public ContaBancaria getContaDestino() {
        return contaDestino;
    }
}
