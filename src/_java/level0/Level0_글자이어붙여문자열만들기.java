package _java.level0;

public class Level0_글자이어붙여문자열만들기 {
    public static void main(String[] args) {
        String test1 = "cvsgiorszzzmrpaqpe";
        int[] test2 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1); // programmers

        String test3 = "zpiaz";
        int[] test4 = {1, 2, 0, 0, 3};
        String solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2); // pizza
    }

    public static String solution(String my_string, int[] index_list) {
        StringBuffer sb = new StringBuffer();
        for (int index : index_list) {
            char ch = my_string.charAt(index);
            sb.append(ch);
        }

        return sb.toString();
    }
}
