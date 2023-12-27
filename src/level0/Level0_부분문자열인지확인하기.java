package level0;

public class Level0_부분문자열인지확인하기 {
    public static void main(String[] args) {
        int solution1 = solution("banana", "ana"); // 1
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("banana", "wxyz"); // 0
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String my_string, String target) {
        return my_string.contains(target) == true ? 1 : 0;
    }
}
