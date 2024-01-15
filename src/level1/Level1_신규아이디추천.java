package level1;

public class Level1_신규아이디추천 {
    public static void main(String[] args) {
        // 예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
        //예2	"z-+.^."	"z--"
        //예3	"=.="	"aaa"
        //예4	"123_.def"	"123_.def"
        //예5	"abcdefghijklmn.p"	"abcdefghijklmn"

//        String solution1 = solution("...!@BaT#*..y.abcdefghijklm");
//        System.out.println("solution1 = " + solution1);
//
//        String solution2 = solution("z-+.^.");
//        System.out.println("solution2 = " + solution2);

        String solution3 = solution("=.=");
        System.out.println("solution3 = " + solution3);

//        String solution4 = solution("123_.def");
//        System.out.println("solution4 = " + solution4);
//
//        String solution5 = solution("abcdefghijklmn.p");
//        System.out.println("solution5 = " + solution5);
    }

    public static String solution(String new_id) {
        String step1 = step1(new_id);
        String step2 = step2(step1);
        String step3 = step3(step2);
        String step4 = step4(step3);
        System.out.println("step4 = " + step4);
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
        char firstChar = step3.charAt(0);
        if (firstChar == '.') {
            step3 = step3.substring(1);
        }
        char lastChar = step3.charAt(step3.length() - 1);
        if (lastChar == '.') {
            step3 = step3.substring(0, step3.length() - 2);

        }
        return step3;
    }

    public static String step5(String step4) {
        return null;
    }

    public static String step6(String step5) {
        return null;
    }

    public static String step7(String step6) {
        return null;
    }
}
