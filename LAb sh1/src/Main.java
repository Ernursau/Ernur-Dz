public class Main {
    public static void main(String[] args) {

        Vehicle car1 = new Car("Toyota", "Camry", 2020, 4, "Automatic");
        Vehicle car2 = new Car("Honda", "Civic", 2018, 4, "Manual");
        Vehicle motorcycle1 = new Moto("Yamaha", "R1", 2019, "Sport", true);


        Garage garage1 = new Garage();
        garage1.addVehicle(car1);
        garage1.addVehicle(motorcycle1);

        Garage garage2 = new Garage();
        garage2.addVehicle(car2);


        Fleet fleet = new Fleet();
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);


        Vehicle foundVehicle = fleet.searchVehicle("Toyota", "Camry");
        if (foundVehicle != null) {
            System.out.println("В гараже найдено: " + foundVehicle);
        } else {
            System.out.println("Нет токого транспорта .");
        }
    }
}