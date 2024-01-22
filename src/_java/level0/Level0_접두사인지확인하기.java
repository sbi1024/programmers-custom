package _java.level0;

public class Level0_접두사인지확인하기 {
    public static void main(String[] args) {
        // "banana"	"ban"	1
        // "banana"	"nan"	0
        // "banana"	"abcd"	0
        // "banana"	"bananan"	0

        int solution1 = solution("banana", "ban");
        System.out.println("solution1 = " + solution1); // 1

        int solution2 = solution("banana", "nan");
        System.out.println("solution2 = " + solution2); // 0

        int solution3 = solution("banana", "abcd");
        System.out.println("solution3 = " + solution3); // 0

        int solution4 = solution("banana", "bananan");
        System.out.println("solution4 = " + solution4); // 0
    }

    public static int solution(String my_string, String is_prefix) {
        for (int i = 0; i < my_string.length(); i++) {
            String subMyString = my_string.substring(0, i);
            if (subMyString.equals(is_prefix)) {
                return 1;
            }
        }
        return 0;
    }
}
