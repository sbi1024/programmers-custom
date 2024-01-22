package java.level0;

public class Level0_모스부호 {
    public static void main(String[] args) {
        String solution1 = solution(".... . .-.. .-.. ---");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution(".--. -.-- - .... --- -.");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.",
                "-..", ".", "..-.",
                "--.", "....", "..",
                ".---", "-.-", ".-..",
                "--", "-.", "---",
                ".--.", "--.-", ".-.",
                "...", "-", "..-",
                "...-", ".--", "-..-",
                "-.--", "--.."};
        String[] alphaArray = new String[morse.length];
        int alphaIndex = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            alphaArray[alphaIndex] = String.valueOf(c);
            alphaIndex++;
        }
        String[] splitLetter = letter.split(" ");
        for (String let : splitLetter) {
            for (int i = 0; i < morse.length; i++) {
                if (let.equals(morse[i])) {
                    answer += alphaArray[i];
                }
            }
        }
        return answer;
    }
}
