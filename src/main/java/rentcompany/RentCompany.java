package rentcompany;

import java.util.ArrayList;
import java.util.List;
import rentcompany.car.Car;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final List<String> baseCamp;

    public RentCompany(List<String> baseCamp) {
        this.baseCamp = baseCamp;
    }

    public static RentCompany create() {
        return new RentCompany(new ArrayList<>());
    }

    public void addCar(Car car) {
        baseCamp.add(car.getName() + " : " + (int)car.getChargeQuantity() + "리터" + NEWLINE);
    }

    public String generateReport() {
        return baseCamp.toString().substring(1, baseCamp.toString().length() - 1).replaceAll(", ", "");
    }
}
