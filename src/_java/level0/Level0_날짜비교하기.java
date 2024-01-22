package _java.level0;

import java.time.LocalDate;

public class Level0_날짜비교하기 {
    public static void main(String[] args) {
        int[] test1 = {2021, 12, 28};
        int[] test2 = {2021, 12, 29};
        int[] test3 = {1024, 10, 24};
        int[] test4 = {1024, 10, 24};

        int solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] date1, int[] date2) {
        LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);

        if (localDate1.isBefore(localDate2)) {
            return 1;
        } else {
            return 0;
        }
    }
}
