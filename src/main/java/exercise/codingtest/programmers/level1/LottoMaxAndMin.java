package exercise.codingtest.programmers.level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LottoMaxAndMin {

    public int[] solution(int[] lottos, int[] win_nums) {
        //7로 초기화한 뒤, 숫자가 일치하는 만큼 뺄셈
        int low = 7, max;

        //int 배열 Integer 배열로 변환
        Integer[] myNumbers = Arrays.stream(lottos).boxed().toArray(Integer[]::new);
        Integer[] winNumbers = Arrays.stream(win_nums).boxed().toArray(Integer[]::new);

        //1. 0의 갯수 확인
        int countOfZero = 0;
        for (Integer myNumber : myNumbers) {
            if(myNumber == 0) countOfZero++;
        }

        Set<Integer> myNumberSet = new HashSet<>(Arrays.asList(myNumbers));
        Set<Integer> winNumberSet = new HashSet<>(Arrays.asList(winNumbers));

        //교집합 수 구하기
        winNumberSet.retainAll(myNumberSet);
        int countOfMatch = winNumberSet.size();

        low = low - countOfMatch;
        max = low - countOfZero;
        low = Math.min(low, 6);
        max = Math.min(max, 6);

        return new int[]{max, low};
    }

    static class Solution {
        public static void main(String[] args) {
            LottoMaxAndMin lotto = new LottoMaxAndMin();
            //int[] lottos = new int[] {44, 1, 0, 0, 31, 25};
            //int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};
            //int[] lottos = new int[] {0,0,0,0,0,0};
            //int[] win_nums = new int[]{38, 19, 20, 40, 15, 25};
            int[] lottos = new int[] {45, 4, 35, 20, 3, 9};
            int[] win_nums = new int[]{20, 9, 3, 45, 4, 35};

            System.out.println(Arrays.toString(lotto.solution(lottos, win_nums)));
        }
    }

}
