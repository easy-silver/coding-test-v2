package exercise.codingtest.programmers.level1;

/**
 * 2020 카카오 인턴십
 * 키패드 누르기
 */
public class Keypad {

    public String pressKeypad(int[] numbers) {
        StringBuilder answer = new StringBuilder();

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer.append("L");
            }
        }

        return answer.toString();
    }
}
