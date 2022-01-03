package exercise.codingtest.programmers.level1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberStringAndEnglishWordTest {

    @Test
    void replace() {
        //given
        String word = "one4seveneight";

        //when
        String result = word.replace("one", "1");

        //then
        assertThat(result).isEqualTo("14seveneight");
    }

    @Test
    void replaceArray() {
        //given
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String input = "one4seveneight";

        //when
        for (int i = 0; i < words.length; i++) {
            input = input.replace(words[i], numbers[i]);
        }

        //then
        assertThat(Integer.parseInt(input)).isEqualTo(1478);
    }

    @Test
    void solution() {
        NumberStringAndEnglishWord numberStringAndEnglishWord = new NumberStringAndEnglishWord();

        assertThat(numberStringAndEnglishWord.solution("one4seveneight")).isEqualTo(1478);
        assertThat(numberStringAndEnglishWord.solution("23four5six7")).isEqualTo(234567);
        assertThat(numberStringAndEnglishWord.solution("2three45sixseven")).isEqualTo(234567);
        assertThat(numberStringAndEnglishWord.solution("123")).isEqualTo(123);
    }
}