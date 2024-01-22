package _java.level0;

public class Level0_문자열이몇번등장하는지세기 {
    public static void main(String[] args) {
        int solution1 = solution("banana", "ana");
        System.out.println("solution1 = " + solution1); // 2

        int solution2 = solution("aaaa", "aa");
        System.out.println("solution1 = " + solution2); // 3
    }

    public static int solution(String myString, String pat) {
        int count = 0;

        int firstIndex = 0;
        int lastIndex = myString.length() - pat.length();
        while (firstIndex <= lastIndex) {
            String subMyString = myString.substring(firstIndex, firstIndex + pat.length());
            if (subMyString.equals(pat)) {
                count++;
            }
            firstIndex++;
        }


        return count;
    }
}
