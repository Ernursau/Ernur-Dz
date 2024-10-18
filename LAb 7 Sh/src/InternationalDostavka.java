public class InternationalDostavka implements IShippingStrategy{

    public double Colculate(double weight, double distance,boolean isNight) {
        return 50 + (weight*3)+(distance*2.5);
    }
}
