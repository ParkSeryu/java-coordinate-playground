public class Sonata extends Car {

    private final int distance;
    private static final int liter = 10;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return liter;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return "Sonata";
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
