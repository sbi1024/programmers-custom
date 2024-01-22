package _java.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Level0_주사위게임2 {
    public static void main(String[] args) {
        int solution1 = solution(2, 6, 1);
        System.out.println("solution1 = " + solution1); // 9

        int solution2 = solution(5, 3, 3);
        System.out.println("solution2 = " + solution2); // 473

        int solution3 = solution(4, 4, 4);
        System.out.println("solution3 = " + solution3); // 110592
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        switch (distinctList.size()) {
            case 1:
                answer = (a + b + c) *
                        (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) *
                        (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
                break;
            case 2:
                answer = (a + b + c) *
                        (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
                break;
            case 3:
                answer = a + b + c;
                break;
        }

        return answer;
    }
}
