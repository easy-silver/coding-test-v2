package exercise.codingtest.programmers.level1;

import org.springframework.util.StringUtils;

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

    //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    public String changeDotOne(String userId) {
        return userId.replaceAll("\\.{2,}", ".");
    }

    //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    public String removeDotAtSide(String userId) {
        if (userId.charAt(0) == '.') {
            userId = userId.substring(1);
        }
        if (StringUtils.hasText(userId) && userId.charAt(userId.length() - 1) == '.') {
            userId = userId.substring(0, userId.length() - 1);
        }
        return userId;
    }

}
