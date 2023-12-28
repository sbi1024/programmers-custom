package level0;

public class Level0_원하는문자열찾기 {
    public static void main(String[] args) {
        int solution1 = solution("AbCdEfG", "aBc");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("aaAA", "aaaaa");
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String myString, String pat) {
        String lowMyString = myString.toLowerCase();
        String lowPat = pat.toLowerCase();
        if (lowMyString.contains(lowPat)) {
            return 1;
        } else {
            return 0;
        }
    }
}
