package java.level0;

import java.util.Arrays;

public class Level0_문자개수세기 {
    public static void main(String[] args) {
        int[] solution1 = solution("Programmers");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(String my_string) {
        String lowerAlphabet = "";
        String UpperAlphabet = "";

        for (char ch = 'A'; ch <= 'Z'; ch++)
            UpperAlphabet += ch;

        lowerAlphabet = UpperAlphabet.toLowerCase();
        String alphabet = UpperAlphabet + lowerAlphabet;

        int[] answer = new int[alphabet.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[alphabet.indexOf(my_string.charAt(i))]++;
        }

        return answer;
    }
}
