package _java.level0;

public class Level0_외계행성의나이 {
    public static void main(String[] args) {
        String solution1 = solution(23);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution(51);
        System.out.println("solution2 = " + solution2);

        String solution3 = solution(100);
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(int age) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        char[] charArray = new char[26];
        for (char c = 'a'; c <= 'z'; c++) {
            charArray[index] = c;
            index++;
        }
        String[] splitAge = String.valueOf(age).split("");
        for (String str : splitAge) {
            char alphabet = charArray[Integer.parseInt(str)];
            sb.append(alphabet);
        }
        return sb.toString();
    }
}
