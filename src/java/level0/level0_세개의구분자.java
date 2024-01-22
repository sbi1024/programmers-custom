package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class level0_세개의구분자 {
    public static void main(String[] args) {
        String[] solution1 = solution("baconlettucetomato");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // ["onlettu", "etom", "to"]

        String[] solution2 = solution("abcd");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // ["d"]

        String[] solution3 = solution("cabab");
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // ["EMPTY"]
    }

    public static String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        String replaceAllMyStr = myStr.replaceAll("[a-c]", " ");
        String[] replaceAllMyStrSplit = replaceAllMyStr.split(" ");
        for (int i = 0; i < replaceAllMyStrSplit.length; i++) {
            if (!replaceAllMyStrSplit[i].isEmpty()) {
                list.add(replaceAllMyStrSplit[i]);
            }
        }

        if (list.size() == 0) {
            list.add("EMPTY");
            return list.stream().toArray(String[]::new);
        } else {
            return list.stream().toArray(String[]::new);
        }
    }
}
