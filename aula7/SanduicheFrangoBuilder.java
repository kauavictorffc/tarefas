public class SanduicheFrangoBuilder implements SanduicheBuilder {
    private Sanduiche sanduiche;

    public SanduicheFrangoBuilder() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void construirPao() {
        sanduiche.setPao("Pão branco");
    }

    @Override
    public void construirCarne() {
        sanduiche.setCarne("Frango grelhado");
    }

    @Override
    public void construirVegetais() {
        sanduiche.setVegetais("Alface, Tomate");
    }

    @Override
    public void construirCondimentos() {
        sanduiche.setCondimentos("Maionese, Molho BBQ");
    }

    @Override
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}
