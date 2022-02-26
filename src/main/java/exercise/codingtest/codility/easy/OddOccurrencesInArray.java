package exercise.codingtest.codility.easy;

public class OddOccurrencesInArray {

    public int solution(int[] A) {

        //A의 길이 -1 만큼 반복
        int lengthOfArray = A.length;
        for (int i = 0; i < lengthOfArray - 1; i++) {
            int firstNumber = A[i];

            //현재 인덱스 값이 0이 아닌지 확인
            if (firstNumber == 0) {
                continue;
            }

            //현재 인덱스 + 1부터 시작해서 A의 길이만큼 반복
            for (int j = i + 1; j < lengthOfArray; j++) {
                int secondNumber = A[j];

                //현재 인덱스 값이 0이 아닌지 확인
                if (secondNumber == 0) {
                    continue;
                }

                //현재 인덱스 값과 +j의 값이 같은지 확인
                if (firstNumber == secondNumber) {
                    //같다면 i번째 값과 j번째 값을 0 으로 치환
                    A[i] = 0;
                    A[j] = 0;
                    break;
                }
            }
        }

        //배열 길이만큼 반복하며 0이 아닌 수 반환
        for (int number : A) {
            if (number != 0) {
                return number;
            }
        }
        return 0;
    }
}
