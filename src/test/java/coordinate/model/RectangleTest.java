package coordinate.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(new ArrayList<>());
    }

    @DisplayName("좌표 24 이상은 실패한다.")
    @Test
    void coordinateValidTest() {
        // given
        String[] input = new String[]{"10,10", "14,25"};
//        String input = "(10,10)-(14,25)";

        // when // then
        assertThatThrownBy(() -> rectangle.create(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표는 24까지 입력 가능합니다.");
    }

    @DisplayName("계산이 잘 되는지 확인한다.")
    @Test
    void rectangleCalculateTest() {
        // given
        String[] input = new String[]{"10,10","22,10","22,18","10,18"};
        rectangle.create(input);

        // when
        double result = rectangle.calculate();

        // then
        assertThat(result).isEqualTo(96, offset(0.00099));
    }

}