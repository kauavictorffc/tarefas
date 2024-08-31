public class SanduicheVeganoBuilder implements SanduicheBuilder {
    private Sanduiche sanduiche;

    public SanduicheVeganoBuilder() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void construirPao() {
        sanduiche.setPao("Pão integral");
    }

    @Override
    public void construirCarne() {
        sanduiche.setCarne("Sem carne");
    }

    @Override
    public void construirVegetais() {
        sanduiche.setVegetais("Alface, Tomate, Pepino");
    }

    @Override
    public void construirCondimentos() {
        sanduiche.setCondimentos("Mostarda, Maionese");
    }

    @Override
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}
