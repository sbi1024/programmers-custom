package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_5명씩 {
    public static void main(String[] args) {
        String[] test1 = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        int nameLength = names.length;
        int mod = nameLength / 5;
        int remain = nameLength % 5;
        for (int i = 0; i < mod; i++) {
            list.add(names[i * 5]);
        }
        if (remain != 0) {
            list.add(names[mod * 5]);
        }
        return list.toArray(new String[0]);
    }
}
