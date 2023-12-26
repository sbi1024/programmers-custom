package level0;

public class Level0_l로만들기 {
    public static void main(String[] args) {
        String solution1 = solution("abcdevwxyz");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("jjnnllkkmm");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String myString) {
        int lInt = 'l';
        char[] strCharArray = myString.toCharArray();
        for (int i = 0; i < strCharArray.length; i++) {
            int intCharValue = strCharArray[i];
            if (lInt > intCharValue) {
                strCharArray[i] = 'l';
            }
        }
        return String.valueOf(strCharArray);
    }
}
