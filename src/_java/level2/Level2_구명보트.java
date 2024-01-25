package _java.level2;

import java.util.Arrays;

public class Level2_구명보트 {
    // TODO 아예 아이디어 도 없이 실패한 문제임, 수학적인 문제를 못푸는거 같은데 큰일이다
    // TODO DEQUEUE 를 통해 푸는 방법도 한번 도전해보면 좋을거 같다.
    public static void main(String[] args) {
        int[] test1 = {70, 50, 80, 50};
        int solution1 = solution(test1, 100);
        System.out.println("solution1 = " + solution1); // 3

        int[] test2 = {70, 80, 50};
        int solution2 = solution(test2, 100);
        System.out.println("solution2 = " + solution2); // 3

        int[] test3 = {20, 90, 40, 10, 20, 85, 99, 11};
        int solution3 = solution(test3, 100);
        System.out.println("solution3 = " + solution3); //
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int index = 0;
        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                answer++;
                index++;
            } else {
                answer++;
            }
        }

        return answer;
    }
}
