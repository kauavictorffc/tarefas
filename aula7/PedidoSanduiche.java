public class PedidoSanduiche {
    public static void main(String[] args) {
        // Construção de um sanduíche vegano padrão
        SanduicheBuilder veganoBuilder = new SanduicheVeganoBuilder();
        DiretorSanduicheVegano diretorVegano = new DiretorSanduicheVegano(veganoBuilder);
        Sanduiche sanduicheVegano = diretorVegano.fazerSanduiche();
        System.out.println(sanduicheVegano);

        // Construção de um sanduíche de frango padrão
        SanduicheBuilder frangoBuilder = new SanduicheFrangoBuilder();
        DiretorSanduicheFrango diretorFrango = new DiretorSanduicheFrango(frangoBuilder);
        Sanduiche sanduicheFrango = diretorFrango.fazerSanduiche();
        System.out.println(sanduicheFrango);

        // Criação personalizada de sanduíche
        SanduicheBuilder personalizadoBuilder = new SanduicheVeganoBuilder(); // ou SanduicheFrangoBuilder
        personalizadoBuilder.construirPao();
        personalizadoBuilder.construirCarne();
        personalizadoBuilder.construirVegetais();
        personalizadoBuilder.construirCondimentos();
        Sanduiche sanduichePersonalizado = personalizadoBuilder.getSanduiche();
        System.out.println(sanduichePersonalizado);
    }
}
