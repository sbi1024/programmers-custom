package _java.level1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Level1_두개뽑아서더하기 {
    // TODO 문제는 빠르게 풀었으나, 해당 로직의 속도가 현저히 느림, 어떻게 개선할수 있는지 확인이 필요함
    // TODO 경우의 수 문제에 대한 풀이도 다시한번 생각해 봐야 할듯
    public static void main(String[] args) {
        int[] test1 = {2, 1, 3, 4, 1};
        int[] solution1 = solution(test1); // [2,3,4,5,6,7]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {5, 0, 2, 7};
        int[] solution2 = solution(test2); // [2,5,7,9,12]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    int anotherIndexSum = numbers[i] + numbers[j];
                    set.add(anotherIndexSum);
                }
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
