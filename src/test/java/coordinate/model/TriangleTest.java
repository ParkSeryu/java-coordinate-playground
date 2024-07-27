package coordinate.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @DisplayName("삼각형의 넓이를 구한다.")
    @Test
    void TriangleCalculateTest() {
        // given
        String[] input = new String[]{"10,10", "14,15", "20,8"};
        Triangle triangle = new Triangle(new ArrayList<>());
        triangle.create(input);

        // when
        double calculate = triangle.calculate();

        // then
        assertThat(calculate).isEqualTo(29.0, offset(0.00099));
    }

}