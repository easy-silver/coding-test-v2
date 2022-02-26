package exercise.codingtest.codility.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CyclicRotationTest {

    CyclicRotation cyclicRotation = new CyclicRotation();

    @Test
    void solution1 () {
        //given
        int[] a = new int[]{3, 8, 9, 7, 6};
        int k = 3;

        //when
        int[] result = cyclicRotation.solution(a, k);

        //then
        assertThat(result).isEqualTo(new int[]{9, 7, 6, 3, 8});
    }

    @Test
    void solution2 () {
        //given
        int[] a = new int[]{0, 0, 0};
        int k = 1;

        //when
        int[] result = cyclicRotation.solution(a, k);

        //then
        assertThat(result).isEqualTo(new int[]{0, 0, 0});
    }

    @Test
    void solution3 () {
        //given
        int[] a = new int[]{1, 2, 3, 4};
        int k = 4;

        //when
        int[] result = cyclicRotation.solution(a, k);

        //then
        assertThat(result).isEqualTo(new int[]{1, 2, 3, 4});
    }


}