package exercise.codingtest.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

    @Test
    void buyAndSell1() {
        //given
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        //when
        int result = solution.maxProfit(prices);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    void buyAndSell2() {
        //given
        int[] prices = new int[]{7, 6, 4, 3, 1};

        //when
        int result = solution.maxProfit(prices);

        //then
        assertThat(result).isEqualTo(0);
    }

}