package rentcompany.car;

public class K5 implements Car {

    private final int distance;
    private static final int liter = 13;

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return liter;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return "rentcompany.car.K5";
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
