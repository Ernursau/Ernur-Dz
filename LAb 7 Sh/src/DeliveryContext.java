class DeliveryContext {
    private IShippingStrategy shippingStrategy;

    public void setShippingStrategy(IShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double Colculate(double weight, double distance, boolean isNight) {
        if (shippingStrategy == null) throw new IllegalStateException("Shipping strategy is not set");
        return shippingStrategy.Colculate(weight, distance, isNight);
    }
}
