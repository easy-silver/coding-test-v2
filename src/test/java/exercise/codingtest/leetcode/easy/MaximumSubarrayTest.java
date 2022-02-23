package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumSubarrayTest {

    MaximumSubarray solution = new MaximumSubarray();

    @Test
    void maxSubArray1() {
        //given
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

        //when
        int result = solution.maxSubArray(nums);

        //then
        assertThat(result).isEqualTo(6);
    }
    
    @Test
    void maxSubArray2() {
        //given
        int[] nums = new int[]{1};

        //when
        int result = solution.maxSubArray(nums);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void maxSubArray3() {
        //given
        int[] nums = new int[]{5, 4, -1, 7, 8};

        //when
        int result = solution.maxSubArray(nums);

        //then
        assertThat(result).isEqualTo(23);
    }

}