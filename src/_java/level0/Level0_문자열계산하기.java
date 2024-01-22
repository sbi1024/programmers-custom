package _java.level0;

public class Level0_문자열계산하기 {
    public static void main(String[] args) {
        int solution1 = solution("3 + 4");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("3 + 4 - 5");
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("3 + 4 - 2");
        System.out.println("solution3 = " + solution3);

        int solution4 = solution("3 + 4 - 2 + 4 - 2 + 4 - 2 - 2");
        System.out.println("solution4 = " + solution4);

        int solution5 = solution("10 + 1");
        System.out.println("solution5 = " + solution5);
    }

    public static int solution(String my_string) {
        int answer = 0;

        String[] splitMyStr = my_string.split(" ");
        answer = Integer.parseInt(splitMyStr[0]);
        for (int i = 1; i < splitMyStr.length; i++) {
            if (i % 2 == 1) {
                if (splitMyStr[i].equals("+")) {
                    answer += Integer.parseInt(splitMyStr[i + 1]);
                } else {
                    answer -= Integer.parseInt(splitMyStr[i + 1]);
                }
            }
        }

        return answer;
    }
}
