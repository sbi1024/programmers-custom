package level0;

public class Level0_문자열뒤집기 {
    public static void main(String[] args) {
        String solution1 = solution("Progra21Sremm3", 6, 12);
        System.out.println("solution1 = " + solution1); // ProgrammerS123

        String solution2 = solution("Stanley1yelnatS", 4, 10);
        System.out.println("solution2 = " + solution2); // Stanley1yelnatS
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        String subMyString = my_string.substring(s, e + 1);
        sb.append(subMyString);

        String replaceMyString = my_string.replace(subMyString, " ");
        String reverseSubMyString = sb.reverse().toString();

        return replaceMyString.replace(" ", reverseSubMyString);
    }
}
