public class StandartDostavka implements IShippingStrategy{

    public double Colculate(double weight, double distance,boolean isNight) {
        double cost = 10 + (weight*1.5)+(distance*1);
        return isNight ? cost*2:cost;
    }
}
