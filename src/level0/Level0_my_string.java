package level0;

public class Level0_my_string {
    public static void main(String[] args) {
        String solution1 = solution("masterpiece");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("programmers");
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("jerry");
        System.out.println("solution3 = " + solution3);

        String solution4 = solution("burn");
        System.out.println("solution4 = " + solution4);
    }

    public static String solution(String rny_string) {
        return rny_string.replace("m","rn");
    }
}
