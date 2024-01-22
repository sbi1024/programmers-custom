package _java.level1;

public class Level1_크기가작은부분문자열 {
    public static void main(String[] args) {
        int solution1 = solution("3141592", "271");
        System.out.println("solution1 = " + solution1); // 2

        int solution2 = solution("500220839878", "7");
        System.out.println("solution2 = " + solution2); // 8

        int solution3 = solution("10203", "15");
        System.out.println("solution3 = " + solution3); // 3
    }

    public static int solution(String t, String p) {
        int answer = 0;

        int tLength = t.length();
        int pLength = p.length();
        long standValue = Long.parseLong(p);

        for (int i = 0; i <= tLength - pLength; i++) {
            if (Long.parseLong(t.substring(i, i + pLength)) <= standValue) answer++;
        }

        return answer;
    }
}
