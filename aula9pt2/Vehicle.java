public class Vehicle {
    private String id;
    private String model;
    private int year;

    // Construtor
    public Vehicle(String id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", model=" + model + ", year=" + year + "]";
    }
}
