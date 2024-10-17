public class Moto extends Vehicle {
    private String Kuzov;
    private boolean Boks;

    public Moto(String make, String model, int year, String Kuzov , boolean Boks) {
        super(make, model, year);
        this.Kuzov = Kuzov;
        this.Boks = Boks;
    }
    public String getKuzov(){
    return Kuzov;
    }
    public boolean getBoks(){
        return Boks;
    }
}


