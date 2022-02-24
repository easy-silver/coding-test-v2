package exercise.codingtest.leetcode.easy;

/**
 * 268. Missing Number
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sumOfRange = nums.length;
        int sumOfNums = 0;

        for (int i = 0; i < nums.length; i++) {
            sumOfRange += i;
            sumOfNums += nums[i];
        }

        return sumOfRange - sumOfNums;
    }
}
