package exercise.codingtest.codility.easy;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer number : A) {
            Integer count = map.get(number);
            if (count == null) {
                map.put(number, 1);

            } else {
                map.put(number, ++count);
            }
        }

        for (Integer number : map.keySet()) {
            if (map.get(number) % 2 != 0) {
                return number;
            }
        }

        return -1;
    }
}
