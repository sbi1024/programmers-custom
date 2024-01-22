package _java.level0;

public class Level0_qrcode {
    public static void main(String[] args) {
        String solution1 = solution(3, 1, "qjnwezgrpirldywt");
        System.out.println("solution1 = " + solution1); // jerry

        String solution2 = solution(1, 0, "programmers");
        System.out.println("solution2 = " + solution2); // programmers
    }

    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            if(i % q == r){
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }
}
