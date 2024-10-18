public class Kaspi implements IPaymentStrategy {
    private String Nomer;
    private String Name;

    public Kaspi(String Nomer,String Name){
        this.Nomer=Nomer;
        this.Name=Name;
    }
    public void pay(double amount){
        System.out.println("Kaspi" + amount);
    }

}
