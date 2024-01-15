package level1;

public class Level1_신규아이디추천 {
    // TODO 정규식 패턴에 대한 이해가 좀더 필요해보임, 정답을 맞추긴 했지만, 아직도 문자열 문자에서
    // 속도적인 면과 간결함의 실력을 얻지는 못한거 같음
    public static void main(String[] args) {
        String solution1 = solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("z-+.^.");
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("=.=");
        System.out.println("solution3 = " + solution3);

        String solution4 = solution("123_.def");
        System.out.println("solution4 = " + solution4);

        String solution5 = solution("abcdefghijklmn.p");
        System.out.println("solution5 = " + solution5);
    }

    public static String solution(String new_id) {
        String step1 = step1(new_id);
        String step2 = step2(step1);
        String step3 = step3(step2);
        String step4 = step4(step3);
        String step5 = step5(step4);
        String step6 = step6(step5);
        String step7 = step7(step6);
        return step7;
    }


    public static String step1(String new_id) {
        return new_id.toLowerCase();
    }

    public static String step2(String step1) {
        return step1.replaceAll("[^a-z0-9-_.]", "");
    }

    public static String step3(String step2) {
        return step2.replaceAll("\\.{2,}", ".");
    }

    public static String step4(String step3) {
        if (!step3.isEmpty()) {
            char firstChar = step3.charAt(0);
            if (firstChar == '.') {
                step3 = step3.substring(1);
            }
        }

        if (!step3.isEmpty()) {
            char lastChar = step3.charAt(step3.length() - 1);
            if (lastChar == '.') {
                step3 = step3.substring(0, step3.length() - 1);
            }
        }
        return step3;
    }

    public static String step5(String step4) {
        if (step4.isEmpty()) {
            step4 = "a";
        }
        return step4;
    }

    public static String step6(String step5) {
        if (step5.length() >= 16) {
            step5 = step5.substring(0, 15);
            if (step5.charAt(step5.length() - 1) == '.') {
                step5 = step5.substring(0, step5.length() - 1);
            }
        }
        return step5;
    }

    public static String step7(String step6) {
        if (step6.length() <= 2) {
            char lastChar = step6.charAt(step6.length() - 1);
            while (step6.length() < 3) {
                step6 += lastChar;
            }
        }
        return step6;
    }
}
