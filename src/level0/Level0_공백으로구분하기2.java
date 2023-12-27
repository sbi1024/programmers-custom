package level0;

import java.util.Arrays;

public class Level0_공백으로구분하기2 {
    public static void main(String[] args) {
        String[] solution1 = solution(" i    love  you");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] solution2 = solution("    programmers  ");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static String[] solution(String my_string) {
        return Arrays.stream(my_string.split(" "))
                .filter(value -> !value.isEmpty())
                .toArray(String[]::new);
    }
}
