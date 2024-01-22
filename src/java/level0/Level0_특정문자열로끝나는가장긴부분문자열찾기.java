package java.level0;

public class Level0_특정문자열로끝나는가장긴부분문자열찾기 {
    public static void main(String[] args) {
        String solution1 = solution("AbCdEFG", "dE"); // AbCdE
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("AAAAaaaa", "a"); // AAAAaaaa
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String myString, String pat) {
        int firstIndex = 0;
        int lastIndex = myString.length() - pat.length();
        int maxIndex = 0;
        while (firstIndex <= lastIndex) {
            String subMyStr = myString.substring(firstIndex, firstIndex + pat.length());
            if (subMyStr.equals(pat)) {
                maxIndex = firstIndex + pat.length();
            }
            firstIndex++;
        }

        return myString.substring(0, maxIndex);
    }
}
