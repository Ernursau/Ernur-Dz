public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private boolean engineOn;

    // Конструктор
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineOn = false;  // По умолчанию двигатель выключен
    }


    public void startEngine() {
        if (!engineOn) {
            engineOn = true;
            System.out.println("Двигатель включен.");
        } else {
            System.out.println("Двигатель уже работает.");
        }
    }


    public void stopEngine() {
        if (engineOn) {
            engineOn = false;
            System.out.println("Двигатель остановлен.");
        } else {
            System.out.println("Двигатель уже остановлен.");
        }
    }

}
