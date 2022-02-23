package exercise.codingtest.leetcode.easy;

import java.util.Arrays;

/**
 * Easy - #217
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        //배열을 오름차 순으로 정렬한다.
        Arrays.sort(nums);

        //첫 번째 인덱스부터 nums 길이-1만큼 반복한다.
        for (int i = 0; i < nums.length - 1; i++) {
            //현재 인덱스의 값을 변수에 담는다.
            int targetValue = nums[i];
            if (targetValue == nums[i + 1]) {
                return true;
            }

        }
        return false;
    }

}
