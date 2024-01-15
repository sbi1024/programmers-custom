package level1;

public class Level1_숫자문자열과영단어 {
    public static void main(String[] args) {
        int solution1 = solution("one4seveneight");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("23four5six7");
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("2three45sixseven");
        System.out.println("solution3 = " + solution3);

        int solution4 = solution("123");
        System.out.println("solution4 = " + solution4);
    }

    public static int solution(String s) {
        String replaceStr = s.replace("zero", "0")
                .replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9");

        return Integer.parseInt(replaceStr);
    }
}
