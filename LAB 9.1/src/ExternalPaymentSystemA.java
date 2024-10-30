class ExternalPaymentSystemA {
    public void makePayment(double amount) {
        System.out.println("Оплата Картой:Оплата прошла  " + amount);
    }

    public void makeRefund(double amount) {
        System.out.println("Оплата Картой:Возват денег " + amount);
    }
}