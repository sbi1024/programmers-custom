package level0;

import java.util.ArrayList;
import java.util.List;

public class Level0_문자열밀기 {
    public static void main(String[] args) {
        int solution1 = solution("hello", "ohell");// 1
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("apple", "elppa");// -1
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("atat", "tata");// 1
        System.out.println("solution3 = " + solution3);

        int solution4 = solution("abc", "abc");// 0
        System.out.println("solution4 = " + solution4);
    }

    public static int solution(String A, String B) {
        int answer = 0;
        if (A.equals(B)) {
            return answer;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            char lastChar = A.charAt(A.length() - 1);
            String remainStr = A.substring(0, A.length() - 1);
            A = lastChar + remainStr;
            if (A.equals(B)) {
                result.add(i + 1);
            }
        }

        if (result != null && result.size() > 0) {
            answer = result.stream().mapToInt(Integer::intValue).min().getAsInt();
        } else {
            answer = -1;
        }
        return answer;
    }

}
