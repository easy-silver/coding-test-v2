package exercise.codingtest.codility.easy;

public class BinaryGap {

    public int solution(int n) {

        String binaryString = Integer.toBinaryString(n);
        int maximumCount = 0, currentCount = 0;

        for (char c : binaryString.toCharArray()) {
            //0이면 카운팅
            if (c == '0') {
                currentCount++;

            //1이면 max 값 비교
            } else {
                maximumCount = Math.max(maximumCount, currentCount);
                currentCount = 0;
            }
        }
        //더 큰 값 반환
        return maximumCount;
    }

}
