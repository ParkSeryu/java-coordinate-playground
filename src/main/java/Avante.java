public class Avante extends Car {

    private final int distance;
    private static final int liter = 15;

    public Avante(int distance) {
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
        return "Avante";
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
