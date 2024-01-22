package java.level0;

import java.util.Scanner;

public class Level0_PCCE기출문제3번나이계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        } else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }
        System.out.println(answer);
    }
}
