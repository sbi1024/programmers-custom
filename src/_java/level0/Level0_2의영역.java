package _java.level0;

import java.util.Arrays;
import java.util.List;

public class Level0_2의영역 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 1, 4, 5, 2, 9};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {1, 2, 1};
        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] test3 = {1, 1, 1};
        int[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));

        int[] test4 = {1, 2, 1, 2, 1, 10, 2, 1};
        int[] solution4 = solution(test4);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));
    }

    public static int[] solution(int[] arr) {
        String[] strArr = Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
        List<String> strArrList = Arrays.asList(strArr);
        int firstIndex = strArrList.indexOf("2");
        int secondIndex = strArrList.lastIndexOf("2");

        if (firstIndex == -1 && secondIndex == -1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            return strArrList.subList(firstIndex, secondIndex + 1).stream().mapToInt(Integer::valueOf).toArray();
        }
    }
}
