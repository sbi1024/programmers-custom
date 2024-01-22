package java.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Level1_정수내림차순으로배치하기 {
    public static void main(String[] args) {
        long solution1 = solution(118372);
        System.out.println("solution1 = " + solution1); // 873211
    }

    public static long solution(long n) {
        String[] splitN = String.valueOf(n).split("");
        Arrays.sort(splitN, Collections.reverseOrder());
        return Long.parseLong(Arrays.stream(splitN).collect(Collectors.joining()));
    }
}
