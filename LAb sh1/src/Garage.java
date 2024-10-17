import java.util.ArrayList;
import java.util.List;
class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }


    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle + " Добавлен.");
    }

    // Метод для удаления транспортного средства
    public void removeVehicle(Vehicle vehicle) {
        if (vehicles.remove(vehicle)) {
            System.out.println(vehicle + " Продона");
        } else {
            System.out.println(vehicle + " Нет токой транспорта.");
        }
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
