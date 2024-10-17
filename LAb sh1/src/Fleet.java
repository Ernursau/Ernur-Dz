import java.util.ArrayList;
import java.util.List;
public class Fleet {
    private List<Garage> garages;

    public Fleet() {
        garages = new ArrayList<>();
    }


    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Новый гараж куплен.");
    }

    // Метод для удаления гаража
    public void removeGarage(Garage garage) {
        if (garages.remove(garage)) {
            System.out.println("Гараж продан.");
        } else {
            System.out.println("Нет токого гаража .");
        }
    }


    public Vehicle searchVehicle(String brand, String model) {
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) {
                if (vehicle.toString().contains(brand) && vehicle.toString().contains(model)) {
                    return vehicle;
                }
            }
        }
        return null;
    }



}