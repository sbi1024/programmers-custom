package _java.level0;

public class Level0_A로B만들기 {
    public static void main(String[] args) {
        int solution1 = solution("olleh", "hello");
        System.out.println("solution1 = " + solution1); // 1

        int solution2 = solution("allpe", "apple");
        System.out.println("solution2 = " + solution2); // 0

    }

    public static int solution(String before, String after) {
        String[] splitAfter = after.split("");
        for (String split : splitAfter) {
            if (before.contains(split)) {
                before = before.replaceFirst(split, "");
            }
        }
        if (before.length() != 0) {
            return 0;
        }
        return 1;
    }
}
