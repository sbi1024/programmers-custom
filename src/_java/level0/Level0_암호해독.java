package _java.level0;

public class Level0_암호해독 {
    public static void main(String[] args) {
        String solution1 = solution("dfjardstddetckdaccccdegk", 4);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("pfqallllabwaoclk", 2);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String cipher, int code) {
        String answer = "";

        String[] split = cipher.split("");
        for (int i = 0; i < split.length; i++) {
            if ((i + 1) % code == 0) {
                answer += split[i];
            }
        }

        return answer;
    }
}
