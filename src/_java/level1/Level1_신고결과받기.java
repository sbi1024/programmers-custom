package _java.level1;

import java.util.*;

public class Level1_신고결과받기 {
    // TODO 한번에 정답은 맞췄으나, 시간복잡도를 좀더 고려해서 깔끔하게 코드를 수정해야 할 필요가 있어보임
    // 굳이 누가 누구를 신고했고, 누가 신고당했는지 나눠서 구성하지 않고, 신고당한놈 데이터만 관리했으면 어땟을까?
    // map 변수의 value 부분에 list 를 사용했는데, set 을 써보면 어땟을까 하는 생각 (해결) -> 신고당한 인원이 누가 신고했는지의 생각 시작점부터 다시 로직 구성 해보기
    public static void main(String[] args) {
        String[] test1 = {"muzi", "frodo", "apeach", "neo"};
        String[] test2 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int[] solution1 = solution(test1, test2, 2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [2,1,1,0]

        String[] test3 = {"con", "ryan"};
        String[] test4 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int[] solution2 = solution(test3, test4, 3);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [0,0]
    }

    public static int[] solution1(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, List<String>> reportMap = new HashMap<>();
        Map<String, List<String>> reportedMap = new HashMap<>();
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new ArrayList<>());
            reportedMap.put(id, new ArrayList<>());
            resultMap.put(id, 0);
        }

        for (String re : report) {
            String[] splitReport = re.split(" ");
            String reportUser = splitReport[0];
            String reportedUser = splitReport[1];
            List<String> reportedList = reportMap.get(reportUser);
            if (!reportedList.contains(reportedUser)) {
                reportedList.add(reportedUser);
            }
            reportMap.put(reportUser, reportedList);
        }

        for (String reportMapKey : reportMap.keySet()) {
            List<String> reportMapValue = reportMap.get(reportMapKey);
            for (String reportValue : reportMapValue) {
                List<String> reportedMapValue = reportedMap.get(reportValue);
                reportedMapValue.add(reportMapKey);
                reportedMap.put(reportValue, reportedMapValue);
            }
        }

        for (String resultMapKey : resultMap.keySet()) {
            List<String> reportedMapValue = reportedMap.get(resultMapKey);
            if (reportedMapValue.size() >= k) {
                for (String rep : reportedMapValue) {
                    resultMap.put(rep, resultMap.get(rep) + 1);
                }
            }
        }

        int count = 0;
        for (Integer value : resultMap.values()) {
            answer[count] = value;
            count++;
        }

        return answer;
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> reportMap = new HashMap<>();
        Map<String, List<String>> reportedMap = new HashMap<>();
        Map<String, Integer> resultMap = new LinkedHashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
            reportedMap.put(id, new ArrayList<>());
            resultMap.put(id, 0);
        }

        for (String re : report) {
            String[] splitReport = re.split(" ");
            String reportUser = splitReport[0];
            String reportedUser = splitReport[1];
            Set<String> reportMapValue = reportMap.get(reportUser);
            reportMapValue.add(reportedUser);
            reportMap.put(reportUser, reportMapValue);
        }

        for (String reportMapKey : reportMap.keySet()) {
            Set<String> reportMapValue = reportMap.get(reportMapKey);
            for (String reportValue : reportMapValue) {
                List<String> reportedMapValue = reportedMap.get(reportValue);
                reportedMapValue.add(reportMapKey);
                reportedMap.put(reportValue, reportedMapValue);
            }
        }

        for (String resultMapKey : resultMap.keySet()) {
            List<String> reportedMapValue = reportedMap.get(resultMapKey);
            if (reportedMapValue.size() >= k) {
                for (String rep : reportedMapValue) {
                    resultMap.put(rep, resultMap.get(rep) + 1);
                }
            }
        }

        int count = 0;
        for (Integer value : resultMap.values()) {
            answer[count] = value;
            count++;
        }

        return answer;
    }
}
