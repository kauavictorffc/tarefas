public class DiretorSanduicheVegano {
    private SanduicheBuilder builder;

    public DiretorSanduicheVegano(SanduicheBuilder builder) {
        this.builder = builder;
    }

    public Sanduiche fazerSanduiche() {
        builder.construirPao();
        builder.construirCarne();
        builder.construirVegetais();
        builder.construirCondimentos();
        return builder.getSanduiche();
    }
}
