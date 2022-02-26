package exercise.codingtest.codility.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OddOccurrencesInArrayTest {

    OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

    @Test
    void solution1() {
        //given
        int[] A = new int[]{9, 3, 9, 3, 9, 7, 9};

        //when
        int result = oddOccurrencesInArray.solution(A);

        //then
        assertThat(result).isEqualTo(7);
    }

    @Test
    void solution2() {
        //given
        int[] A = new int[]{1, 3, 3, 1, 1, 9, 9};

        //when
        int result = oddOccurrencesInArray.solution(A);

        //then
        assertThat(result).isEqualTo(1);
    }
}