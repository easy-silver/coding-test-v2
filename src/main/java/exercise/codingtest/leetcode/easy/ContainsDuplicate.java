package exercise.codingtest.leetcode.easy;

/**
 * Easy - #217
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        //첫 번째 인덱스부터 nums 길이-1만큼 반복한다.
        for (int i = 0; i < nums.length - 1; i++) {
            //현재 인덱스의 값을 변수에 담는다.
            int targetValue = nums[i];

            //현재 인덱스의 다음 인덱스부터 nums의 길이만큼 반복한다.
            for (int j = i+1; j < nums.length; j++) {
                //첫 번째 인덱스 값과 현재 인덱스의 값이 같은지 확인한다.
                if (targetValue == nums[j]) {
                    //같다면 true를 리턴한다.
                    return true;
                }
            }
        }
        return false;
    }

}
