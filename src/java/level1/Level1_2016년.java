package java.level1;

import java.time.LocalDate;

public class Level1_2016년 {
    public static void main(String[] args) {
        String solution1 = solution(5, 24);
        System.out.println("solution1 = " + solution1); // "TUE"
    }

    public static String solution(int a, int b) {
        String answer = "";
        int day = LocalDate.of(2016, a, b).getDayOfWeek().getValue();

        switch (day) {
            case 1:
                answer =  "MON";
                break;
            case 2:
                answer =  "TUE";
                break;
            case 3:
                answer =  "WED";
                break;
            case 4:
                answer =  "THU";
                break;
            case 5:
                answer =  "FRI";
                break;
            case 6:
                answer =  "SAT";
                break;
            case 7:
                answer =  "SUN";
                break;
        }
        return answer;
    }
}
