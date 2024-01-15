package level1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Level1_실패율 {
    public static void main(String[] args) {
        // TODO 일반 Double 타입을 통해 문제풀이 시도 필요, BigDecimal 클래스를 미사용한 풀이도 필요해보임
        int[] test1 = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] solution1 = solution(5, test1); // [3,4,2,1,5]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {4, 4, 4, 4, 4};
        int[] solution2 = solution(4, test2); // [4,1,2,3]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] test3 = {1, 1, 1, 2, 3, 4};
        int[] solution3 = solution(5, test3); // [4, 1, 3, 2, 5]
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int N, int[] stages) {
        Map<Integer, BigDecimal> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int child = 0;
            int parent = 0;
            for (int j = 0; j < stages.length; j++) {
                int stage = stages[j];
                if (stage == i) {
                    child++;
                }
                if (stage >= i) {
                    parent++;
                }
            }
            if (child == 0 || parent == 0) {
                map.put(i, BigDecimal.ZERO);
            } else {
                BigDecimal bd1 = new BigDecimal(child);
                BigDecimal bd2 = new BigDecimal(parent);
                map.put(i, bd1.divide(bd2, MathContext.DECIMAL64));
            }
        }

        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList, (o1, o2) -> {
            BigDecimal bigDecimal1 = map.get(o1);
            BigDecimal bigDecimal2 = map.get(o2);
            int compareResult = bigDecimal1.compareTo(bigDecimal2);
            if (compareResult == -1) {
                return 1;
            } else if (compareResult == 0) {
                return o1.compareTo(o2);
            } else {
                return -1;
            }
        });

        return keyList.stream().mapToInt(Integer::intValue).toArray();
    }
}
