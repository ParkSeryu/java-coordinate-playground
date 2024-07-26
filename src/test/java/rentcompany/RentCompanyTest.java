package rentcompany;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import rentcompany.car.Avante;
import rentcompany.car.K5;
import rentcompany.car.Sonata;

public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "rentcompany.car.Sonata : 15리터" + NEWLINE +
                        "rentcompany.car.K5 : 20리터" + NEWLINE +
                        "rentcompany.car.Sonata : 12리터" + NEWLINE +
                        "rentcompany.car.Avante : 20리터" + NEWLINE +
                        "rentcompany.car.K5 : 30리터" + NEWLINE
        );
    }
}
