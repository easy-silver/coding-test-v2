package exercise.codingtest.leetcode.easy;

/**
 * #191 Number of 1 Bits
 */
public class NumberOf1Bits {

    public int hammingWeight(int n) {

        String binaryString = Integer.toBinaryString(n);
        String replacedString = binaryString.replace("0", "");

        return replacedString.length();
    }
}
