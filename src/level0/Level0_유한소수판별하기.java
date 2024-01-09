package level0;

import java.util.ArrayList;
import java.util.List;

public class Level0_유한소수판별하기 {
    public static void main(String[] args) {
        int solution1 = solution(7, 20);
        System.out.println("solution1 = " + solution1); // 1

        int solution2 = solution(11, 22);
        System.out.println("solution2 = " + solution2); // 2

        int solution3 = solution(12, 21);
        System.out.println("solution3 = " + solution3); // 2
    }

    public static int solution(int a, int b) {
        int answer = 1;
        int gcd = GCD(a, b);
        int modB = b / gcd;
        List<Integer> list = primeNumbers(modB);
        List<Integer> correctList = new ArrayList<>();
        List<Integer> notCorrectList = new ArrayList<>();
        for (Integer integer : list) {
            int data = integer.intValue();
            if (data == 2 || data == 5) {
                correctList.add(data);
            } else {
                notCorrectList.add(data);
            }
        }
        if (notCorrectList != null && notCorrectList.size() > 0) {
            return 2;
        }
        return answer;
    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

    public static List<Integer> primeNumbers(int modB) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= modB; i++) {
            List<Integer> tempList = new ArrayList<>();
            if ((modB % i == 0)) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        tempList.add(i);
                    }
                }
                if (tempList.size() == 2) {
                    list.add(i);
                }
            }
        }
        return list;
    }
}
