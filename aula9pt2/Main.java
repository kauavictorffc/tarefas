public class Main {
    public static void main(String[] args) {
        // Cria uma instância da classe legada
        OldVehicleStorage oldVehicleStorage = new OldVehicleStorage();

        // Cria uma instância do Adapter
        VehicleStorageAdapter adapter = new VehicleStorageAdapter(oldVehicleStorage);

        // Cria um objeto Vehicle
        Vehicle vehicle = new Vehicle("123ABC", "Caminhão", 2020);

        // Armazena os dados do veículo usando o Adapter
        adapter.saveVehicleData(vehicle);
    }
}
