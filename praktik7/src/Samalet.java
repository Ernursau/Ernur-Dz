public class Samalet implements ICostCalculationStrategy{

    @Override
    public double calculatte(int people, int time, int typeClass) {
        double cost = 0;
        if(typeClass==1)
            cost = people*1000;
        else if (typeClass ==2)
                cost = people*500;
        if(time>10)
            cost=people*5;
        return cost;
    }
}

