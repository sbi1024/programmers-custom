package _java.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level2_의상 {
    // TODO 아니 자꾸 이런 수학적인 문제가 나오는데 내가 이걸 어떻게 알아
    // TODO 풀이과정 보고 풀었슴, 정답 못맞췄다... 아니 문제 설명도 이상하고 풀이과정도 기괴한거 같다.
    public static void main(String[] args) {
        String[][] test1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1); // 5

        String[][] test2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2); // 3


        String[][] test3 = {{"yellow_hat", "headgear"}, {"top1", "top"}, {"top2", "top"}, {"blue_sunglasses1", "eyewear"}, {"blue_sunglasses2", "eyewear"}, {"green_turban", "headgear"}};
        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, List<String>> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String first = clothe[0];
            String second = clothe[1];

            List<String> list = map.getOrDefault(second, new ArrayList<>());
            list.add(first);
            map.put(second, list);
        }


        for (Map.Entry<String, List<String>> es : map.entrySet()) {
            answer *= (es.getValue().size() + 1);
        }
        answer--;

        return answer;
    }
}
