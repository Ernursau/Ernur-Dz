public class Car extends Vehicle {

    private int numberOfDoors;
    private String karobkaperedash;


    public Car(String make, String model, int year, int numberOfDoors, String transmissionType) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
        this.karobkaperedash = karobkaperedash;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }


    public String getTransmissionType() {
        return karobkaperedash;
    }

}
