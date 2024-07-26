package coordinate.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {

    private Line line;

    @BeforeEach
    void setUp() {
        List<Coordinate> test = new ArrayList<>();
        Coordinate coordinate = new Coordinate(1, 2);
        test.add(coordinate);

        line = new Line(new ArrayList<>());
    }

    @DisplayName("좌표는 24까지 가질 수 있다.")
    @Test
    void coordinateValidTest() {
        // given
        String input = "(10,10)-(14,25)";

        // when // then
        assertThatThrownBy(() -> line.create(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표는 24까지 입력 가능합니다.");
    }

    @DisplayName("Line에 좌표가 잘 입력 되었는지 확인한다.")
    @Test
    void inputCompleteTest() {
        // given
        String input = "(10,10)-(14,15)";

        // when
        line.create(input);

        // then
        assertThat(line.isSize(2)).isTrue();
    }

    @DisplayName("계산이 잘 되는지 확인한다.")
    @Test
    void LineCalculateTest() {
        // given
        String input = "(10,10)-(14,15)";
        line.create(input);

        // when
        double result = line.calculate();

        // then
        assertThat(result).isEqualTo(6.403124, offset(0.00099));
    }


}