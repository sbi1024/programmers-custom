package _java.level0;

public class Level0_컨트롤제트 {
    public static void main(String[] args) {
        int solution1 = solution("1 2 Z 3");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("10 20 30 40");
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("10 Z 20 Z 1");
        System.out.println("solution3 = " + solution3);

        int solution4 = solution("10 Z 20 Z");
        System.out.println("solution4 = " + solution4);

        int solution5 = solution("-1 -2 -3 Z");
        System.out.println("solution5 = " + solution5);
    }

    public static int solution(String s) {
        int answer = 0;
        String[] splitS = s.split(" ");
        for (int i = 0; i < splitS.length; i++) {
            String splitStr = splitS[i];
            if (splitStr.equals("Z")) {
                answer -= Integer.parseInt(splitS[i - 1]);
            } else {
                answer += Integer.parseInt(splitS[i]);
            }
        }
        return answer;
    }
}
