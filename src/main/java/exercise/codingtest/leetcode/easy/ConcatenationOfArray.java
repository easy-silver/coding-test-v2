package exercise.codingtest.leetcode.easy;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int lengthOfAns = Math.multiplyExact(nums.length, 2);
        int[] ans = new int[lengthOfAns];
        int index = 0;

        for (int i = 0; i < lengthOfAns; i++) {
            ans[i] = nums[index++];

            if (index == nums.length) {
                index = 0;
            }
        }

        return ans;
    }

}
