package _java.level0;

public class Level0_나이출력 {
    public static void main(String[] args) {
        int solution1 = solution(40);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(23);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int age) {
        return (2022 - age) + 1;
    }
}
