package level0;

public class Level0_0떼기 {
    public static void main(String[] args) {
        String solution1 = solution("0010");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("854020");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String n_str) {
        return String.valueOf(Integer.parseInt(n_str));
    }
}
