package level1;

public class Level1_소수만들기 {
    public static void main(String[] args) {
        // TODO 조합과 순열에 대한 이해가 필요해보임, 현재 재귀함수에 대한 이해가 없어서 따라가지를 못함
        // TODO 심지어 디버깅으로 흐름을 따라가려고 해도 이해를 못하는 수준. (https://velog.io/@cgw0519/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%9C%EC%97%B4-%EC%A4%91%EB%B3%B5%EC%88%9C%EC%97%B4-%EC%A1%B0%ED%95%A9-%EC%A4%91%EB%B3%B5%EC%A1%B0%ED%95%A9-%EC%B4%9D%EC%A0%95%EB%A6%AC)
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 7, 6, 4};

        int solution1 = solution(test1); // 1
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2); // 4
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] nums) {
        int answer = -1;

        int[] arr = {1, 2, 7, 6, 4};
        int r = 3;
        combination(arr, new boolean[arr.length], 0, 0, r);

        return answer;
    }

    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(arr, visited, i + 1, depth + 1, r);
                visited[i] = false;
            }
        }
    }
}
