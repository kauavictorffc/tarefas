public class Sanduiche {
    private String pao;
    private String carne;
    private String vegetais;
    private String condimentos;

    public Sanduiche() {
    }

    public void setPao(String var1) {
        this.pao = var1;
    }

    public void setCarne(String var1) {
        this.carne = var1;
    }

    public void setVegetais(String var1) {
        this.vegetais = var1;
    }

    public void setCondimentos(String var1) {
        this.condimentos = var1;
    }

    @Override
    public String toString() {
        return "Sanduiche [pao=" + this.pao + ", carne=" + this.carne + ", vegetais=" + this.vegetais + ", condimentos=" + this.condimentos + "]";
    }

    public static void main(String[] args) {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setPao("Integral");
        sanduiche.setCarne("Frango");
        sanduiche.setVegetais("Alface");
        sanduiche.setCondimentos("Maionese");

        System.out.println(sanduiche);
    }
}
