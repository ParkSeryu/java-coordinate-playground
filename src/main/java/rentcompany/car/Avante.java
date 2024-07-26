package rentcompany.car;

public class Avante implements Car {

    private final int distance;
    private static final int liter = 15;

    public Avante(int distance) {
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
        return "rentcompany.car.Avante";
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
