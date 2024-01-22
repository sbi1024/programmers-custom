package _java.level1;

import java.util.*;

public class Level1_PCCE기출문제10번데이터분석 {
    public static void main(String[] args) {
        int[][] test1 = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        int[][] solution1 = solution(test1, "date", 20300501, "remain");
        System.out.println("Arrays.deepToString(solution1) = " + Arrays.deepToString(solution1));
        // [[3,20300401,10,8],[1,20300104,100,80]]
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Object> map = new HashMap<>();
        int standExtIndex = checkStandard(ext);

        for (int i = 0; i < data.length; i++) {
            int standValue = data[i][standExtIndex];
            if (standValue < val_ext) {
                map.put(String.valueOf(i), data[i]);
            }
        }

        int standSortIndex = checkStandard(sort_by);
        List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> {
            int value1 = ((int[]) map.get(o1))[standSortIndex];
            int value2 = ((int[]) map.get(o2))[standSortIndex];
            if (value1 < value2) {
                return -1;
            } else if (value1 == value2) {
                return 0;
            } else {
                return 1;
            }
        });

        int answerCount = 0;
        int[][] answer = new int[keyList.size()][4];
        for (String key : keyList) {
            answer[answerCount] = (int[]) map.get(key);
            answerCount++;
        }

        return answer;
    }

    public static int checkStandard(String standard) {
        int index = -1;
        switch (standard) {
            case "code":
                index = 0;
                break;
            case "date":
                index = 1;
                break;
            case "maximum":
                index = 2;
                break;
            case "remain":
                index = 3;
                break;
        }
        return index;
    }
}
