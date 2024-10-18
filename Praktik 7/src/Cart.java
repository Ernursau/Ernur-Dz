public class Cart implements IPaymentStrategy{
    private int Number;
    private String cardName;
    private int cvv;

    public Cart (int Number, String cardName , int cvv ){
        this.cardName = cardName;
        this.Number = Number;
        this.cvv= cvv;
    }
    public void pay(double amount){
        System.out.println("Кридитная карта " + amount);
    }
}
