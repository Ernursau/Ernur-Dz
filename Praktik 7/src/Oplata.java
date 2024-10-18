public class Oplata {
    private IPaymentStrategy Oplata;

    public void setOplata(IPaymentStrategy oplata) {
        this.Oplata = Oplata;
    }

    public void pay(double amount) {
        if (Oplata != null) {
            Oplata.pay(amount);
        } else {
            System.out.println("Оплата не прошла .");
        }
    }
}
