package _java.level0;

public class Level0_문자열뒤집기_ {
    public static void main(String[] args) {
        String solution1 = solution("jaron");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("bread");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string) {
         String answer = "";
        int length = my_string.length();
        for (int i = length - 1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
