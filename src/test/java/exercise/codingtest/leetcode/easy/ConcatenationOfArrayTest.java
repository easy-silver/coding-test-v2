package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConcatenationOfArrayTest {

    ConcatenationOfArray solution = new ConcatenationOfArray();

    @Test
    void getConcatenation() {
        //given
        int[] nums = new int[]{1, 2, 1};

        //when
        int[] result = solution.getConcatenation(nums);

        //then
        assertThat(result).containsExactly(1, 2, 1, 1, 2, 1);
    }

    @Test
    void getConcatenation2() {
        //given
        int[] nums = new int[]{1, 3, 2, 1};

        //when
        int[] result = solution.getConcatenation(nums);

        //then
        assertThat(result).containsExactly(1, 3, 2, 1, 1, 3, 2, 1);
    }

}