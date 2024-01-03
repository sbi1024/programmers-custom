package level0;

public class Level0_문자열겹쳐쓰기 {
    public static void main(String[] args) {
        String solution1 = solution("He11oWor1d", "lloWorl", 2);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("Program29b8UYP", "merS123", 7);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String firstStr = my_string.substring(0, s);
        String secondStr = my_string.substring(s + overwrite_string.length());
        return firstStr + overwrite_string + secondStr;
    }
}
