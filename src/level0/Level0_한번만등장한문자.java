package level0;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Level0_한번만등장한문자 {
    public static void main(String[] args) {
        String solution1 = solution("abcabcadc");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("abdc");
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("hello");
        System.out.println("solution3 = " + solution3);

    }

    //    public static String solution(String s) {
//        String[] splitStr = s.split("");
//        for (int i = 0; i < splitStr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < splitStr.length; j++) {
//                if (splitStr[i].equals(splitStr[j])) {
//                    count++;
//                }
//                if (count > 1) {
//                    s = s.replace(splitStr[i], "");
//                    break;
//                }
//            }
//        }
//
//        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
//    }
    public static String solution(String s) {
        String[] splitStr = Arrays.stream(s.split("")).distinct().toArray(String[]::new);

        for (int i = 0; i < splitStr.length; i++) {
            int result = s.length() - s.replace(splitStr[i], "").length();
            if (result > 1) {
                s = s.replace(splitStr[i], "");
            }
        }
        return Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
    }
}
