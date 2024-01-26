package _java.level2;

import java.util.HashSet;

public class Level2_연속부분수열합의개수 {
    // TODO 반복문 기초가 부족한거 같음, Level2에 와서 드는 생각이, 기본 반복문의 대한 이해만 높아도 충분히 풀수 있는 문제가 많음
    public static void main(String[] args) {
        int[] test1 = {7, 9, 1, 1, 4};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1); // 18
    }

    public static int solution(int[] elements) {
        HashSet<Integer> resultSet = new HashSet<>();

        int startIndex = 1;
        int elementLength = elements.length;
        while (startIndex <= elementLength) {
            for (int i = 0; i < elementLength; i++) {
                int sum = 0;
                for (int j = i; j < i + startIndex; j++) {
                    sum += elements[j % elementLength];
                }
                resultSet.add(sum);
            }
            startIndex++;
        }

        return resultSet.size();
    }
}
