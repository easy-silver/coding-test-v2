package exercise.codingtest.codility.easy;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        //a와 같은 길이의 배열을 생성한다.
        int lengthOfArray = A.length;
        int[] resultArray = new int[lengthOfArray];
        
        //A 길이만큼 반복한다.
        for (int i = 0; i < lengthOfArray; i++) {
            //현재 인덱스에 k를 더한 값을 배열 길이로 나누어 나머지 값을 구한다.
            int newIndex = (i + K) % lengthOfArray;
            //그 나머지 값을 새 배열 인덱스로 하여 현재 값을 저장한다.
            resultArray[newIndex] = A[i];
        }

        return resultArray;
    }
}
