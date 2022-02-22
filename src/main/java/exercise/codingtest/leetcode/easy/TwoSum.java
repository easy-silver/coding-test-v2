package exercise.codingtest.leetcode.easy;

public class TwoSum {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        //1. nums의 길이만큼 반복문을 실행한다.
        for (int i = 0; i < nums.length; i++) {
            int remainNumber = target - nums[i];

            //3. 첫 인덱스 +1의 인덱스 값부터 배열의 크기만큼 반복하는 반복문을 실행한다.
            for (int j = i + 1; j < nums.length; j++) {
                //4. 첫 인덱스 값과 더한 값이 target 값이 되는 수를 찾는다.
                if (nums[j] == remainNumber) {
                    return new int[]{i, j};
                }
                //5-2. 못 찾았다면 두 번째 인덱스부터 1번의 반복문을 다시 실행한다.
            }
        }
        return new int[2];
    }
}
