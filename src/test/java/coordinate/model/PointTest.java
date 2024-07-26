package coordinate.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest {

    @DisplayName("좌표는 24까지 가질 수 있다.")
    @Test
    void coordinateValidTest() {
        // given
        String input = "10,25";

        // when // then
        assertThatThrownBy(() -> Point.create(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표는 24까지 입력 가능합니다.");
    }

    @DisplayName("좌표가 잘 생성된다.")
    @Test
    void coordinateValidTestIsSuccess() {
        // given
        String input = "10,24";

        // when
        Point point = Point.create(input);
        Point point1 = new Point(10, 24);

        // then
        assertThat(point).isEqualTo(point1);
    }

}