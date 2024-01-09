package level0;

public class Level0_숨어있는숫자의덧셈2 {
    public static void main(String[] args) {
        int solution1 = solution("aAb1B2cC34oOp");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("1a2b3c4d123Z");
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] myStringSplit = my_string.replaceAll("[^0-9]", " ").split(" ");
        for (String str : myStringSplit) {
            if (!str.equals("")) {
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}
