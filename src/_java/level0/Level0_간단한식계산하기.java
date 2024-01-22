package _java.level0;

public class Level0_간단한식계산하기 {
    public static void main(String[] args) {
        int solution1 = solution("43 + 12"); // 55
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("0 - 7777"); // -7777
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("40000 * 40000"); // 1600000000
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(String binomial) {
        int answer = 0;
        String[] splitBinomial = binomial.split(" ");
        int firstValue = Integer.parseInt(splitBinomial[0]);
        String operation = splitBinomial[1];
        int secondValue = Integer.parseInt(splitBinomial[2]);

        switch (operation) {
            case "+":
                answer = firstValue + secondValue;
                break;
            case "-":
                answer = firstValue - secondValue;
                break;
            case "*":
                answer = firstValue * secondValue;
                break;
        }
        return answer;
    }
}
