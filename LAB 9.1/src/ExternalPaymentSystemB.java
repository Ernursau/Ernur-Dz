class ExternalPaymentSystemB {
    public void sendPayment(double amount) {
        System.out.println("Оплата Red:Оплата прошла " + amount);
    }

    public void processRefund(double amount) {
        System.out.println("Оплата Red:Возват денег" + amount);
    }
}