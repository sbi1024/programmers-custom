package level1;

public class Level1_둘만의암호 {
    public static void main(String[] args) {
        String solution1 = solution("aukks", "wbqd", 5);
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (skip.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        String skipAlphabet = sb.toString();
        sb.setLength(0);
        char[] skipAlphabetCharArray = skipAlphabet.toCharArray();
        int alphabetLength = skipAlphabetCharArray.length;


        char[] sChars = s.toCharArray();
        for (char sChar : sChars) {
            int number = (skipAlphabet.indexOf(sChar) + index) % alphabetLength;
            char ch = skipAlphabetCharArray[number];
            sb.append(ch);
        }

        return sb.toString();
    }

}
