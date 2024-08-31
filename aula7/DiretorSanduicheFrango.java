public class DiretorSanduicheFrango {
    private SanduicheBuilder builder;

    public DiretorSanduicheFrango(SanduicheBuilder builder) {
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