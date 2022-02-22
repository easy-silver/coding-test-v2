package exercise.codingtest.leetcode.easy;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        //1. nums의 길이만큼 반복문을 실행한다.
        for (int i = 0; i < nums.length; i++) {
            //2. 첫 번째 수와 타겟 수를 뺀 결과를 변수에 담는다.
            int remainNumber = target - nums[i];

            //3. 위 인덱스의 다음 인덱스부터 배열의 크기만큼 반복한다.
            for (int j = i + 1; j < nums.length; j++) {
                //4. 남은 값과 일치하는 수를 찾는다.
                if (nums[j] == remainNumber) {
                    //5-1. 찾았다면 인덱스 번호를 순서대로 배열에 담아 반환한다.
                    return new int[]{i, j};
                }
                //5-2. 못 찾았다면 두 번째 인덱스부터 1번의 반복문을 다시 실행한다.
            }
        }
        return new int[2];
    }
}
