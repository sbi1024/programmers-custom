package _java.level0;

public class Level0_모음제거 {
    public static void main(String[] args) {
        String solution1 = solution("bus");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("nice to meet you");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (char ch : charArray) {
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String solution1(String my_string) {
        return my_string.replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");
    }


//    public static String solution(String my_string) {
//        String answer;
//        String[] gather = {"a", "e", "i", "o", "u"};
//
//        for (String str : gather) {
//            if (my_string.contains(str)) {
//                my_string = my_string.replaceAll(str, "");
//            }
//        }
//        answer = my_string;
//        return answer;
//    }
}
