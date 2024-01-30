package _java.level2;

public class Level2_피로도 {
    // TODO 다시풀이 필요
    // TODO 처음으로 재귀함수(순열) 로 문제를 푸는 시도를 했으나, 아직도 재귀함수의 이해가 안된다 ㅠㅠㅠㅠㅠ 어쩌지
    // TODO 그냥 외우는 수밖에 없나,,, ㅠㅠㅠ
    public static int dungeonsLength;
    public static boolean[] isSelected;
    public static int[] permutationArray;
    public static int fatigue;
    public static int[][] dungeonsArray;
    public static int maxCount;


    public static void main(String[] args) {
        int[][] test1 = {{80, 20}, {50, 40}, {30, 10}};
        int solution1 = solution(80, test1);
        System.out.println("solution1 = " + solution1); // 3

        int[][] test2 = {{10, 10}, {10, 10}, {10, 10}};
        int solution2 = solution(9, test2);
        System.out.println("solution2 = " + solution2); // 0
    }

    public static int solution(int k, int[][] dungeons) {
        dungeonsLength = dungeons.length;
        isSelected = new boolean[dungeonsLength + 1];
        permutationArray = new int[dungeonsLength];
        fatigue = k;
        dungeonsArray = dungeons;
        maxCount = 0;

        permutation(0);

        return maxCount;
    }

    public static void permutation(int count) {
        if (count == dungeonsLength) {
            int checkCount = checkMaxCount(fatigue);
            if (checkCount > maxCount) {
                maxCount = checkCount;
            }
            return;
        }

        for (int i = 1; i <= dungeonsLength; i++) {
            if (isSelected[i]) continue;
            isSelected[i] = true;
            permutationArray[count] = i;
            permutation(count + 1);
            isSelected[i] = false;
        }
    }

    public static int checkMaxCount(int tempFatigue) {
        int count = 0;
        for (int i = 0; i < dungeonsLength; i++) {
            int firstValue = dungeonsArray[permutationArray[i] - 1][0];
            int secondValue = dungeonsArray[permutationArray[i] - 1][1];
            if (tempFatigue >= firstValue) {
                tempFatigue -= secondValue;
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}
