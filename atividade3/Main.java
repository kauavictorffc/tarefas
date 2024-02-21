// Classe Produto com responsabilidades separadas - corrigindo o SRP

public class Main {

    // Classe Produto com responsabilidade de armazenar informações
    static class Produto {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }
    }

    // Classe para calcular desconto - separando responsabilidades
    static class Desconto {
        // Método para calcular o desconto
        public double calcularDesconto(double preco) {
            if (preco > 100) {
                return preco * 0.1;
            } else {
                return 0;
            }
        }
    }

    // Classe para exibir informações - separando responsabilidades
    static class Exibicao {
        private Desconto desconto; // Instância de Desconto

        public Exibicao() {
            this.desconto = new Desconto(); // Inicialização de Desconto
        }

        // Método para exibir informações do produto
        public void exibirInformacoes(Produto produto) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Desconto: " + desconto.calcularDesconto(produto.getPreco())); // Cálculo do desconto
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", 150);
        Exibicao exibicao = new Exibicao();
        exibicao.exibirInformacoes(produto);
    }
}
