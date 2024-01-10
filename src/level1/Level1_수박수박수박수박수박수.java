package level1;

public class Level1_수박수박수박수박수박수 {
    public static void main(String[] args) {
        String solution1 = solution(3);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution(4);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(int n) {
        StringBuffer sb = new StringBuffer();
        String su = "수";
        String suBak = "수박";

        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                sb.append(suBak);
            }
        } else {
            for (int i = 0; i < n / 2; i++) {
                sb.append(suBak);
            }
            sb.append(su);
        }
        return sb.toString();
    }
}
