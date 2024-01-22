package java.level0;

public class Level0_편지 {
    public static void main(String[] args) {
        int solution1 = solution("happy birthday!");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("I love you~");
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String message) {
        return message.length() * 2;
    }
}
