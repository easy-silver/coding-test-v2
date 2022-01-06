package exercise.codingtest.programmers.level1;

import java.util.List;

/**
 * 2020 카카오 인턴십
 * 키패드 누르기
 */
public class Keypad {

    private static final List<Integer> LEFT_NUMBERS = List.of(1, 4, 7);
    private static final List<Integer> RIGHT_NUMBERS = List.of(3, 6, 9);

    public String pressKeypad(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        for (int number : numbers) {

            if (LEFT_NUMBERS.contains(number)) {
                answer.append("L");

            } else if (RIGHT_NUMBERS.contains(number)) {
                answer.append("R");
            }
        }

        return answer.toString();
    }
}
