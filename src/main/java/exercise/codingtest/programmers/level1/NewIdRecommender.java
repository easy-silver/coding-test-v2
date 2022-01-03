package exercise.codingtest.programmers.level1;

/**
 * 2021 KAKAO BLIND RECRUITMENT
 * 신규 아이디 추천
 */
public class NewIdRecommender {


    //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
    public String toLowerCase(String userId) {
        return userId.toLowerCase();
    }

    //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    public String removeSpecialCharacters(String userId) {
        return userId.replaceAll("[^a-z0-9-_.]", "");
    }

}
