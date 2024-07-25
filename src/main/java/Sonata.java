public class Sonata implements Car {

    private final int distance;
    private static final int liter = 10;

    public Sonata(int distance) {
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
        return "Sonata";
    }

    @Override
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
