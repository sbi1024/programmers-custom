package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_배열만들기5 {
    public static void main(String[] args) {
        String[] test1 = {"0123456789", "9876543210", "9999999999999"};
        int[] solution1 = solution(test1, 50000, 5, 5); // [56789, 99999]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(String[] intStrs, int k, int s, int l) {
        List<String> list = new ArrayList<>();
        for (String intStr : intStrs) {
            String subIntStr = intStr.substring(s, s + l);
            if (Integer.valueOf(subIntStr) > k) {
                list.add(subIntStr);
            }
        }
        return list.stream().mapToInt(Integer::parseInt).toArray();
    }
}
