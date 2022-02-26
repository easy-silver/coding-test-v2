package exercise.codingtest.codility.easy;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int number : A) {
            if (set.contains(number)) {
                set.remove(number);

            } else {
                set.add(number);
            }
        }

        return set.stream().findAny().get();
    }
}
