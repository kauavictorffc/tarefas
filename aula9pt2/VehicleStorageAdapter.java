public class VehicleStorageAdapter implements IVehicleStorage {
    private OldVehicleStorage oldVehicleStorage;

    // Construtor
    public VehicleStorageAdapter(OldVehicleStorage oldVehicleStorage) {
        this.oldVehicleStorage = oldVehicleStorage;
    }

    @Override
    public void saveVehicleData(Vehicle vehicle) {
        // Converte o objeto Vehicle para o formato esperado pelo método storeVehicleData
        String data = "ID: " + vehicle.getId() + ", Modelo: " + vehicle.getModel() + ", Ano: " + vehicle.getYear();
        oldVehicleStorage.storeVehicleData(data);
    }
}
