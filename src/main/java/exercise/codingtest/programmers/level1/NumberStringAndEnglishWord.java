package exercise.codingtest.programmers.level1;

/**
 * 2021 카카오 채용연계형 인턴십
 * 숫자 문자열과 영단어
 */
public class NumberStringAndEnglishWord {

    public int solution(String s) {
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        for (int i = 0; i < words.length; i++) {
            s = s.replace(words[i], numbers[i]);
        }

        int answer = Integer.parseInt(s);
        return answer;
    }

}
