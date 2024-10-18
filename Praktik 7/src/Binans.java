public class Binans implements IPaymentStrategy{
    private String Moneta;
    private String Kriptakashelek;
    private double Skolko;

    public Binans(String Moneta, String Kriptakashelek,double Skolko){
        this.Moneta = Moneta;
        this.Kriptakashelek = Kriptakashelek;
        this.Skolko = Skolko;
    }
    public void pay(double amount){
        System.out.println("КриптаВалюта" + amount);
    }
}
