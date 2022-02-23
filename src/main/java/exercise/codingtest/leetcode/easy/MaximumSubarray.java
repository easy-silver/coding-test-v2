package exercise.codingtest.leetcode.easy;

/**
 * #53 Maximum Subarray
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        //배열의 첫 번째 값을 현재 합 변수와 최대 합 변수에 저장한다.
        int currentSum = nums[0];
        int maximumSum = nums[0];

        //nums의 두 번째 값부터 nums의 길이만큼 반복문을 실행한다.
        for (int i = 1; i < nums.length; i++) {

            int currentValue = nums[i];

            //현재 값과 (현재 값+현재 합) 값 중 큰 것을 현재 합 변수에 담는다.
            currentSum = Math.max(currentValue, currentSum + currentValue);

            //현재 합과 최대 합을 비교하여 더 큰 값을 담는다.
            maximumSum = Math.max(currentSum, maximumSum);
        }

        return maximumSum;
    }

}
