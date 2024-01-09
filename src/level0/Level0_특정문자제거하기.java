package level0;

public class Level0_특정문자제거하기 {
    public static void main(String[] args) {
        String solution1 = solution("abcdef", "f");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("BCBdbe", "B");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
}
