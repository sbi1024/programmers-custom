package level0;

public class Level0_꼬리문자열 {
    public static void main(String[] args) {
        String[] test1 = {"abc", "def", "ghi"};
        String solution1 = solution(test1, "ef");
        System.out.println("solution1 = " + solution1);

        String[] test2 = {"abc", "bbc", "cbc"};
        String solution2 = solution(test2, "c");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String[] str_list, String ex) {
        StringBuffer sb = new StringBuffer();
        for (String str : str_list) {
            if (!str.contains(ex)) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
