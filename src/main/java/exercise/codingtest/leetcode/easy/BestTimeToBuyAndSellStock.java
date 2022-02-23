package exercise.codingtest.leetcode.easy;

/**
 * Easy - #121
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        //첫 날 가격을 최소 가격으로 시작한다.
        int minPrice = prices[0];
        //최대 이익
        int maxProfit = 0;

        //다음 날부터 배열의 길이만큼 반복한다.
        for (int i = 1; i < prices.length; i++) {
            //현재 인덱스의 값이 오늘의 가격
            int currentPrice = prices[i];

            //오늘의 가격이 최소 가격보다 적다면 최소 가격을 오늘 가격으로 변경한다.
            if (currentPrice < minPrice) {
                minPrice = currentPrice;

            //오늘 가격이 최소 가격보다 적지 않다면 현재 가격에 팔았을 때의 가격을 계산한다.
            } else {
                int currentProfit = currentPrice - minPrice;

                //오늘의 이윤이 최대 이윤보다 크다면 최대 이윤 값을 변경한다.
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }

        //최대 값을 반환한다.
        return maxProfit;
    }

}
