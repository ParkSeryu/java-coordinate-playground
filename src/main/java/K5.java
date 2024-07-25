public class K5 extends Car {

    private final int distance;
    private static final int liter = 13;

    public K5(int distance) {
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
        return "K5";
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
