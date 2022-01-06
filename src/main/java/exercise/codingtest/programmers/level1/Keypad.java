package exercise.codingtest.programmers.level1;

/**
 * 2020 카카오 인턴십
 * 키패드 누르기
 */
public class Keypad {

    public String pressKeypad(int[] numbers) {
        String answer = "";

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                answer += "L";
            }
        }

        return answer;
    }
}
