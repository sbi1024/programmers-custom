package _java.level0;

public class Level0_A강조하기 {
    public static void main(String[] args) {
        String solution1 = solution("abstract algebra");
        System.out.println("solution1 = " + solution1); // "AbstrAct AlgebrA"

        String solution2 = solution("PrOgRaMmErS");
        System.out.println("solution2 = " + solution2); // "progrAmmers"
    }

    public static String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        String replaceStr = myString.replace("a", "A");
        char[] chars = replaceStr.toCharArray();
        for (char ch : chars) {
            if (ch == 'A' || ch == ' ') {
                sb.append(ch);
            } else if (Character.isUpperCase(ch)) {
                sb.append(String.valueOf(ch).toLowerCase());
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
