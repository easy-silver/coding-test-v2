package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MissingNumberTest {

    MissingNumber solution = new MissingNumber();

    @Test
    void missingNumber() {
        //given
        int[] nums = new int[]{3, 0, 1};

        //when
        int result = solution.missingNumber(nums);

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void missingNumber2() {
        //given
        int[] nums = new int[]{0, 1};

        //when
        int result = solution.missingNumber(nums);

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void missingNumber3() {
        //given
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};

        //when
        int result = solution.missingNumber(nums);

        //then
        assertThat(result).isEqualTo(8);
    }

    @Test
    void missingNumber4() {
        //given
        int[] nums = new int[]{1};

        //when
        int result = solution.missingNumber(nums);

        //then
        assertThat(result).isEqualTo(0);
    }
}