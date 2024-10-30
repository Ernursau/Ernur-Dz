public class InternalPaymentProcessor implements IPaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Оплата прошла  " + amount);
    }

    @Override
    public void refundPayment(double amount) {
        System.out.println("Возврат денег " + amount);
    }
}