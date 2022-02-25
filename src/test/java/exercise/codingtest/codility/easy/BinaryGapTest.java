package exercise.codingtest.codility.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    void solution1() {
        //given
        int n = 9;

        //when
        int result = binaryGap.solution(n);

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void solution2() {
        //given
        int n = 529;

        //when
        int result = binaryGap.solution(n);

        //then
        assertThat(result).isEqualTo(4);
    }

    @Test
    void solution3() {
        //given
        int n = 20;

        //when
        int result = binaryGap.solution(n);

        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void solutionZero() {
        //given
        int n1 = 15;
        int n2 = 32;

        //when
        int result1 = binaryGap.solution(n1);
        int result2 = binaryGap.solution(n2);

        //then
        assertThat(result1).isEqualTo(0);
        assertThat(result2).isEqualTo(0);
    }

}