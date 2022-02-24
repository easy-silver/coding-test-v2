package exercise.codingtest.leetcode.easy;

import java.util.Arrays;

/**
 * 268. Missing Number
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        //배열을 오름차순으로 정렬한다.
        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }

        //배열의 길이-1만큼 반복하며 i번째 값에 1을 더했을 때 i+1의 차가 1이 아닌 경우를 찾는다.
        for (int i = 0; i < nums.length - 1; i++) {

            int currentValue = nums[i];
            int nextValue = nums[i + 1];
            if (currentValue + 1 != nextValue) {
                return currentValue + 1;
            }
        }

        return nums.length;
    }
}
