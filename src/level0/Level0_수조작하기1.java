package level0;

public class Level0_수조작하기1 {
    public static void main(String[] args) {
        int solution1 = solution(0, "wsdawsdassw");
        System.out.println("solution1 = " + solution1);
    }

    public static int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            char ch = control.charAt(i);
            switch (ch) {
                case 'w':
                    answer += 1;
                    break;
                case 's':
                    answer -= 1;
                    break;
                case 'd':
                    answer += 10;
                    break;
                case 'a':
                    answer -= 10;
                    break;
            }
        }
        return answer;
    }
}
