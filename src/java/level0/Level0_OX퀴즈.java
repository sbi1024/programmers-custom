package java.level0;

import java.util.Arrays;

public class Level0_OX퀴즈 {
    public static void main(String[] args) {
        String[] test1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] test2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        String[] test3 = {"-5 + 6 = 13", "-5 + 6 = -1", "-5 + 6 - 7 = 5"};

        String[] solution1 = solution(test1);
        System.out.println("solution1 = " + Arrays.toString(solution1)); // ["X", "O"]

        String[] solution2 = solution(test2);
        System.out.println("solution2 = " + Arrays.toString(solution2)); // ["O", "O", "X", "O"]

        String[] solution3 = solution(test3);
        System.out.println("solution3 = " + Arrays.toString(solution3)); // ["X", "X", "X"]
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int j = 0; j < quiz.length; j++) {
            String[] qzSplit = quiz[j].split(" ");
            int sumResult = Integer.parseInt(qzSplit[0]);
            for (int i = 1; i < qzSplit.length; i++) {
                if (qzSplit[i].equals("+")) {
                    sumResult += Integer.parseInt(qzSplit[i + 1]);
                } else if (qzSplit[i].equals("-")) {
                    sumResult -= Integer.parseInt(qzSplit[i + 1]);
                } else if (qzSplit[i].equals("=")) {
                    if (sumResult == Integer.parseInt(qzSplit[i + 1])) {
                        answer[j] = "O";
                        break;
                    } else {
                        answer[j] = "X";
                        break;
                    }
                }
            }
        }
        return answer;
    }

}
