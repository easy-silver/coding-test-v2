package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void containsDuplicate1() {
        //given
        int[] nums = new int[]{1, 2, 3, 1};

        //when
        boolean result = solution.containsDuplicate(nums);

        //then
        assertThat(result).isTrue();
    }

    @Test
    void containsDuplicate2() {
        //given
        int[] nums = new int[]{1, 2, 3, 4};

        //when
        boolean result = solution.containsDuplicate(nums);

        //then
        assertThat(result).isFalse();
    }


    @Test
    void containsDuplicate3() {
        //given
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        //when
        boolean result = solution.containsDuplicate(nums);

        //then
        assertThat(result).isTrue();
    }

}