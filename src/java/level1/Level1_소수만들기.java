package java.level1;

public class Level1_소수만들기 {
    // TODO 조합과 순열에 대한 이해가 필요해보임, 현재 재귀함수에 대한 이해가 없어서 따라가지를 못함
    // TODO 심지어 디버깅으로 흐름을 따라가려고 해도 이해를 못하는 수준. (https://velog.io/@cgw0519/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%88%9C%EC%97%B4-%EC%A4%91%EB%B3%B5%EC%88%9C%EC%97%B4-%EC%A1%B0%ED%95%A9-%EC%A4%91%EB%B3%B5%EC%A1%B0%ED%95%A9-%EC%B4%9D%EC%A0%95%EB%A6%AC)
    // TODO 재귀함수로 문제를 푼다면, 현재 해당 문제의 3개의 조합 뿐만 아니라, 인자값에 따라 경우의수를 구할수 있으나, 단순 반복문으로 푸는 경우, 조합의 갯수에 따라 반복문이 늘어남
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 7, 6, 4};

        int solution1 = solution(test1); // 1
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2); // 4
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int e = j + 1; e < nums.length; e++) {
                    answer += isPrimeNumber(nums[i] + nums[j] + nums[e]) ? 1 : 0;
                }
            }
        }
        return answer;
    }

    public static boolean isPrimeNumber(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
