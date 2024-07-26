package coordinate.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoordinateTest {

    @DisplayName("좌표는 24까지 가질 수 있다.")
    @Test
    void coordinateValidTest() {
        // given
        String input = "10,25";

        // when // then
        assertThatThrownBy(() -> Coordinate.create(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("좌표는 24까지 입력 가능합니다.");
    }

}