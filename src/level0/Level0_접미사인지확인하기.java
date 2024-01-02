package level0;

public class Level0_접미사인지확인하기 {
    public static void main(String[] args) {
        int solution1 = solution("banana", "ana");
        System.out.println("solution1 = " + solution1); // 1

        int solution2 = solution("banana", "nan");
        System.out.println("solution2 = " + solution2); // 0

        int solution3 = solution("banana", "wxyz");
        System.out.println("solution3 = " + solution3); // 0

        int solution4 = solution("banana", "abanana");
        System.out.println("solution4 = " + solution4); // 0
    }

    public static int solution(String my_string, String is_suffix) {
        for (int i = 0; i < my_string.length(); i++) {
            String subMyString = my_string.substring(i);
            if (subMyString.equals(is_suffix)) {
                return 1;
            }
        }
        return 0;
    }
}
