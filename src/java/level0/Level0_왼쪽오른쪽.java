package java.level0;

import java.util.Arrays;

public class Level0_왼쪽오른쪽 {
    public static void main(String[] args) {
        String[] test1 = {"u", "u", "l", "r"};
        String[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] test2 = {"l"};
        String[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        String[] test3 = {"r", "u", "d", "d"};
        String[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));

        String[] test4 = {"l", "u", "d", "d"};
        String[] solution4 = solution(test4);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));

        String[] test5 = {"u", "u", "d", "r"};
        String[] solution5 = solution(test5);
        System.out.println("Arrays.toString(solution5) = " + Arrays.toString(solution5));

        String[] test6 = {"u", "u", "r", "u"};
        String[] solution6 = solution(test6);
        System.out.println("Arrays.toString(solution6) = " + Arrays.toString(solution6));

        String[] test7 = {"u", "u", "l", "u"};
        String[] solution7 = solution(test7);
        System.out.println("Arrays.toString(solution7) = " + Arrays.toString(solution7));

        String[] test8 = {"u", "u", "u", "u"};
        String[] solution8 = solution(test8);
        System.out.println("Arrays.toString(solution8) = " + Arrays.toString(solution8));

        String[] test9 = {"u", "l", "r", "u"};
        String[] solution9 = solution(test9);
        System.out.println("Arrays.toString(solution9) = " + Arrays.toString(solution9));

        String[] test10 = {"u", "r", "r", "u"};
        String[] solution10 = solution(test10);
        System.out.println("Arrays.toString(solution10) = " + Arrays.toString(solution10));


        String[] test11 = {"r", "l"};
        String[] solution11 = solution(test11);
        System.out.println("Arrays.toString(solution11) = " + Arrays.toString(solution11));


        String[] test12 = {"r"};
        String[] solution12 = solution(test12);
        System.out.println("Arrays.toString(solution12) = " + Arrays.toString(solution12));

    }

    public static String[] solution(String[] str_list) {
        String[] answer = {};
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            } else if (str_list[i].equals("r")) {
                return Arrays.copyOfRange(str_list, i + 1, str_list.length);
            }
        }
        return answer;
    }
}
