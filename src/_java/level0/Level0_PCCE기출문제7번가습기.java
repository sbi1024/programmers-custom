package _java.level0;

public class Level0_PCCE기출문제7번가습기 {
    public static void main(String[] args) {
        int solution1 = solution("auto", 23, 45);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("target", 41, 40);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("minimum", 10, 34);
        System.out.println("solution3 = " + solution3);
    }
    public static int func1(int humidity, int val_set) {
        if (humidity < val_set)
            return 3;
        return 1;
    }

    public static int func2(int humidity) {
        if (humidity >= 50)
            return 0;
        else if (humidity >= 40)
            return 1;
        else if (humidity >= 30)
            return 2;
        else if (humidity >= 20)
            return 3;
        else if (humidity >= 10)
            return 4;
        else
            return 5;
    }

    public static int func3(int humidity, int val_set) {
        if (humidity < val_set)
            return 1;
        return 0;
    }

    public static int solution(String mode_type, int humidity, int val_set) {
        int answer = 0;

        if (mode_type.equals("auto")) {
            answer = func2(humidity);
        } else if (mode_type.equals("target")) {
            answer = func1(humidity, val_set);
        } else if (mode_type.equals("minimum")) {
            answer = func3(humidity, val_set);
        }

        return answer;
    }
}
