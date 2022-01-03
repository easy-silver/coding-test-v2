package exercise.codingtest.programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 신규 아이디 추천
 */
class NewIdRecommenderTest {

    @DisplayName("1단계: 모든 대문자를 대응되는 소문자로 치환한다")
    @Test
    void step_1() {
        NewIdRecommender recommender = new NewIdRecommender();

        assertThat(recommender.toLowerCase("...!@BaT#*..y.abcdefghijklm")).isEqualTo("...!@bat#*..y.abcdefghijklm");
        assertThat(recommender.toLowerCase("z-+.^.")).isEqualTo("z-+.^.");
        assertThat(recommender.toLowerCase("=.=")).isEqualTo("=.=");
        assertThat(recommender.toLowerCase("123_.def")).isEqualTo("123_.def");
        assertThat(recommender.toLowerCase("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn.p");
    }

}