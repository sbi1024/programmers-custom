package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level0_배열의원소삭제하기 {
    public static void main(String[] args) {
        int[] test1 = {293, 1000, 395, 678, 94};
        int[] test2 = {94, 777, 104, 1000, 1, 12};
        int[] test3 = {110, 66, 439, 785, 1};
        int[] test4 = {377, 823, 119, 43};

        int[] solution1 = solution(test1, test2);
        System.out.println("solution1 = " + Arrays.toString(solution1));

        int[] solution2 = solution(test3, test4);
        System.out.println("solution2 = " + Arrays.toString(solution2));

    }

    public static int[] solution(int[] arr, int[] delete_list) {
        List<Integer> deleteIndexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    deleteIndexList.add(arr[i]);
                }
            }
        }
        if (deleteIndexList != null && deleteIndexList.size() > 0) {
            List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
            arrList.removeAll(deleteIndexList);
            return arrList.stream().mapToInt(Integer::intValue).toArray();
        } else {
            return arr;
        }
    }

}
