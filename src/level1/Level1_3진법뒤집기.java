package level1;

public class Level1_3진법뒤집기 {
    public static void main(String[] args) {
        int solution1 = solution(45); // 7
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(125); // 229
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        StringBuffer sb = new StringBuffer();
        sb.append(Integer.toString(n, 3));
        sb.reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}
