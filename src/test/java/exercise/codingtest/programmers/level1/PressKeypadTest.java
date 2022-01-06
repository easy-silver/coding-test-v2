package exercise.codingtest.programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 키패드 누르기
 */
class PressKeypadTest {

    @DisplayName("1, 4, 7은 무조건 왼손 사용")
    @Test
    void must_left() {
        //given
        int[] numbers = {1, 4, 7};

        //when
        PressKeypad keypad = new PressKeypad();
        String answer = keypad.solution(numbers);

        //then
        assertThat(answer).isEqualTo("LLL");
    }

}