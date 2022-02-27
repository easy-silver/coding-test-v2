package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    ValidParentheses solution = new ValidParentheses();

    @Test
    void isValid1() {
        //given
        String s = "()";
        //when
        boolean result = solution.isValid(s);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void isValid2() {
        //given
        String s = "()[]{}";
        //when
        boolean result = solution.isValid(s);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void isValid3() {
        //given
        String s = "(]";
        //when
        boolean result = solution.isValid(s);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void isValid4() {
        //given
        String s = "({})";
        //when
        boolean result = solution.isValid(s);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void isValid5() {
        //given
        String s = "[";
        //when
        boolean result = solution.isValid(s);
        //then
        assertThat(result).isFalse();
    }
}