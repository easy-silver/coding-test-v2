package exercise.codingtest.leetcode.easy;

/**
 * 338. Counting Bits
 */
public class CountingBits {

    public int[] countBits(int n) {

        int[] result = new int[n + 1];
        result[0] = 0;

        for (int i = 1; i <= n; i++) {
            result[i] = Integer.bitCount(i);
        }

        return result;
    }
}
