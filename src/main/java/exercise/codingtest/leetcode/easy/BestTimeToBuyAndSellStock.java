package exercise.codingtest.leetcode.easy;

/**
 * Easy - #121
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int max = 0;

        //배열의 마지막 인덱스부터 배열의 두 번째 인덱스까지 반복문을 실행한다.
        for (int i = prices.length - 1; i > 0; i--) {
            //마지막 값을 변수에 담는다.
            int sellPrice = prices[i];
            //현재 인덱스의 이전 인덱스부터 배열의 첫 번째 인덱스까지 반복문을 실행한다.
            for (int j = i - 1; j >= 0; j--) {
                //마지막 값과 현재 인덱스의 값을 뺀다.
                int profit = sellPrice - prices[j];

                //Max 값보다 크다면 뺄셈의 결과를 Max 값에 넣는다.
                if (profit > max) {
                    max = profit;
                }
            }
        }

        //MAX 값을 반환한다.
        return max;
    }

}
