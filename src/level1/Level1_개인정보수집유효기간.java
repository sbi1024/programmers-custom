package level1;

import java.util.*;

public class Level1_개인정보수집유효기간 {
    // TODO 한방 통과 카카오 컷 ~
    public static void main(String[] args) {
        // "2022.05.19"	["A 6", "B 12", "C 3"]	["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]	[1, 3]
        // "2020.01.01"	["Z 3", "D 5"]	["2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"]	[1, 4, 5]

        String[] test1 = {"A 6", "B 12", "C 3"};
        String[] test2 = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] solution1 = solution("2022.05.19", test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [1, 3]

        String[] test3 = {"Z 3", "D 5"};
        String[] test4 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        int[] solution2 = solution("2020.01.01", test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [1, 4, 5]
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        Set<Integer> resultSet = new TreeSet<>();
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            termMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] privacySplit = privacies[i].split(" ");
            Integer termMapValue = termMap.get(privacySplit[1]);

            String[] todaySplit = today.split("\\.");
            String[] privacyDateSplit = privacySplit[0].split("\\.");

            int nowDay = (Integer.parseInt(todaySplit[0]) * 12 * 28) + (Integer.parseInt(todaySplit[1]) * 28) + (Integer.parseInt(todaySplit[2]));
            int privacyPlusTermDay = (Integer.parseInt(privacyDateSplit[0]) * 12 * 28) + (Integer.parseInt(privacyDateSplit[1]) * 28) + Integer.parseInt(privacyDateSplit[2]) + (termMapValue * 28) - 1;

            if (nowDay > privacyPlusTermDay) {
                resultSet.add(i + 1);
            }
        }

        int index = 0;
        int[] answer = new int[resultSet.size()];
        for (Integer result : resultSet) {
            answer[index] = result;
            index++;
        }

        return answer;
    }
}
