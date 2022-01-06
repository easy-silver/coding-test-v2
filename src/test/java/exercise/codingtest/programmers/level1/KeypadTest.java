package exercise.codingtest.programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 키패드 누르기
 */
class KeypadTest {

    @DisplayName("1, 4, 7은 무조건 왼손 사용")
    @Test
    void must_left() {
        //given
        int[] numbers1 = {1, 4, 7};
        int[] numbers2 = {1, 7};
        int[] numbers3 = {4};

        //when
        Keypad keypad = new Keypad();
        String answer1 = keypad.pressKeypad(numbers1);
        String answer2 = keypad.pressKeypad(numbers2);
        String answer3 = keypad.pressKeypad(numbers3);

        //then
        assertThat(answer1).isEqualTo("LLL");
        assertThat(answer2).isEqualTo("LL");
        assertThat(answer3).isEqualTo("L");
    }

}