package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOf1BitsTest {

    NumberOf1Bits solution = new NumberOf1Bits();

    @Test
    void hammingWeight1() {
        //given
        int n = 11;

        //when
        int result = solution.hammingWeight(n);

        //then
        assertThat(result).isEqualTo(3);
    }

    @Test
    void hammingWeight2() {
        //given
        int n = 0;

        //when
        int result = solution.hammingWeight(n);

        //then
        assertThat(result).isEqualTo(0);
    }

    @Test
    void hammingWeight3() {
        //given
        int n = 3;

        //when
        int result = solution.hammingWeight(n);

        //then
        assertThat(result).isEqualTo(2);
    }

}