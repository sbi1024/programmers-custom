package _java.level1;

import java.util.Arrays;

public class Level1_비밀지도 {
    public static void main(String[] args) {
        // TODO 비트 연산자를 통한 최적화 진행 필요
        int[] test1 = {9, 20, 28, 18, 11};
        int[] test2 = {30, 1, 21, 17, 28};
        String[] solution1 = solution(5, test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
        // [
        // "#####",
        // "# # #",
        // "### #",
        // "# ##",
        // "#####"
        // ]

        int[] test3 = {46, 33, 33, 22, 31, 50};
        int[] test4 = {27, 56, 19, 14, 14, 10};
        String[] solution2 = solution(6, test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
        // [
        // "######",
        // "### #",
        // "## ##",
        // " #### ",
        // " #####",
        // "### # "
        // ]
    }

    public static String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];

        for (int i = 0; i < n; i++) {
            strArr1[i] = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i])));
            strArr2[i] = String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i])));
        }

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            String str1 = strArr1[i];
            String str2 = strArr2[i];
            for (int j = 0; j < n; j++) {
                String st1 = String.valueOf(str1.charAt(j));
                String st2 = String.valueOf(str2.charAt(j));
                if (st1.equals("1") || st2.equals("1")) {
                    sb.append("#");
                } else if (st1.equals("0") && st2.equals("0")) {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        StringBuffer sb = new StringBuffer();
        sb.append("%").append(n).append("s");

        for (int i = 0; i < n; i++) {
            answer[i] = String.format(sb.toString(), answer[i])
                    .replace("1", "#")
                    .replace("0", " ");
        }

        return answer;
    }
}
