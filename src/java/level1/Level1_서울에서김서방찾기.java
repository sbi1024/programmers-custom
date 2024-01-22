package java.level1;

public class Level1_서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] test1 = {"Jane", "Kim"};
        String solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String[] seoul) {
        int index = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}
