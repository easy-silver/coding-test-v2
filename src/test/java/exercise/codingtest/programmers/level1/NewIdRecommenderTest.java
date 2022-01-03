package exercise.codingtest.programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 신규 아이디 추천
 */
class NewIdRecommenderTest {

    NewIdRecommender recommender = new NewIdRecommender();

    @DisplayName("1단계: 모든 대문자를 대응되는 소문자로 치환한다")
    @Test
    void step_1() {
        assertThat(recommender.toLowerCase("...!@BaT#*..y.abcdefghijklm")).isEqualTo("...!@bat#*..y.abcdefghijklm");
        assertThat(recommender.toLowerCase("z-+.^.")).isEqualTo("z-+.^.");
        assertThat(recommender.toLowerCase("=.=")).isEqualTo("=.=");
        assertThat(recommender.toLowerCase("123_.def")).isEqualTo("123_.def");
        assertThat(recommender.toLowerCase("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn.p");
    }

    @DisplayName("2단계: 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거한다")
    @Test
    void step_2() {
        assertThat(recommender.removeSpecialCharacters("...!@bat#*..y.abcdefghijklm")).isEqualTo("...bat..y.abcdefghijklm");
        assertThat(recommender.removeSpecialCharacters("z-+.^.")).isEqualTo("z-..");
        assertThat(recommender.removeSpecialCharacters("=.=")).isEqualTo(".");
        assertThat(recommender.removeSpecialCharacters("123_.def")).isEqualTo("123_.def");
        assertThat(recommender.removeSpecialCharacters("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn.p");
    }

    @DisplayName("3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환한다")
    @Test
    void step_3() {
        assertThat(recommender.changeDotOne("...bat..y.abcdefghijklm")).isEqualTo(".bat.y.abcdefghijklm");
        assertThat(recommender.changeDotOne("z-..")).isEqualTo("z-.");
        assertThat(recommender.changeDotOne("=.=")).isEqualTo("=.=");
        assertThat(recommender.changeDotOne("123_.def")).isEqualTo("123_.def");
        assertThat(recommender.changeDotOne("abcdefghijklmn.p")).isEqualTo("abcdefghijklmn.p");
    }

}