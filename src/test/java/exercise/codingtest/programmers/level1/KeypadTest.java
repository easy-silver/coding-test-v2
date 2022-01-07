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

    @DisplayName("3, 6, 9는 무조건 오른손 사용")
    @Test
    void must_right() {
        //given
        int[] numbers1 = {3, 6, 9};
        int[] numbers2 = {3, 9};
        int[] numbers3 = {9};

        //when
        Keypad keypad = new Keypad();
        String answer1 = keypad.pressKeypad(numbers1);
        String answer2 = keypad.pressKeypad(numbers2);
        String answer3 = keypad.pressKeypad(numbers3);

        //then
        assertThat(answer1).isEqualTo("RRR");
        assertThat(answer2).isEqualTo("RR");
        assertThat(answer3).isEqualTo("R");
    }

    @DisplayName("2, 5, 8은 현재 위치와의 거리를 계산하여 선택한다.")
    @Test
    void choice_center() {
        //given
        int[] number = {2, 5, 8};

        //when
        Keypad keypad = new Keypad();
        String answer = keypad.pressKeypad(number);

        //then
        assertThat(answer).isEqualTo("RRR");
    }

}