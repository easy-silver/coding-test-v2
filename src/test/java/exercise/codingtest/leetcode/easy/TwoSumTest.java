package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void twoSum1() {
        //given
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        //when
        int[] result = TwoSum.twoSum(nums, target);

        //then
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(1);
    }

    @Test
    void twoSum2() {
        //given
        int[] nums = new int[]{3,3};
        int target = 6;

        //when
        int[] result = TwoSum.twoSum(nums, target);

        //then
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(1);
    }

    @Test
    void twoSum3() {
        //given
        int[] nums = new int[]{3,2,4};
        int target = 6;

        //when
        int[] result = TwoSum.twoSum(nums, target);

        //then
        assertThat(result[0]).isEqualTo(1);
        assertThat(result[1]).isEqualTo(2);
    }

    @Test
    void twoSum4() {
        //given
        int[] nums = new int[]{0, 4, 3, 0};
        int target = 0;

        //when
        int[] result = TwoSum.twoSum(nums, target);

        //then
        assertThat(result[0]).isEqualTo(0);
        assertThat(result[1]).isEqualTo(3);
    }

    @Test
    void twoSum5() {
        //given
        int[] nums = new int[]{-1, -2, -3, -4, -5};
        int target = -8;

        //when
        int[] result = TwoSum.twoSum(nums, target);

        //then
        assertThat(result[0]).isEqualTo(2);
        assertThat(result[1]).isEqualTo(4);
    }

}