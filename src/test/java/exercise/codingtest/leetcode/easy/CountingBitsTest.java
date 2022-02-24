package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountingBitsTest {

    CountingBits solution = new CountingBits();
    
    @Test
    void countBits() {
        //given
        int n = 2;

        //when
        int[] result = solution.countBits(n);

        //then
        assertThat(result.length).isEqualTo(n + 1);
        assertThat(result).isEqualTo(new int[]{0, 1, 1});
    }
    
    @Test
    void countBits2() {
        //given
        int n = 5;

        //when
        int[] result = solution.countBits(n);

        //then
        assertThat(result.length).isEqualTo(n + 1);
        assertThat(result).isEqualTo(new int[]{0, 1, 1, 2, 1, 2});
    }
}