package _java.level1;

public class Level1_PCCE기출문제1번붕대감기 {
    public static void main(String[] args) {
        int[] test1 = {5, 1, 5};
        int[][] test2 = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};
        int solution1 = solution(test1, 30, test2);
        System.out.println("solution1 = " + solution1); // 5

        int[] test3 = {3, 2, 7};
        int[][] test4 = {{1, 15}, {5, 16}, {8, 6}};
        int solution2 = solution(test3, 20, test4);
        System.out.println("solution2 = " + solution2); // -1

        int[] test5 = {4, 2, 7};
        int[][] test6 = {{1, 15}, {5, 16}, {8, 6}};
        int solution3 = solution(test5, 20, test6);
        System.out.println("solution3 = " + solution3); // -1

        int[] test7 = {1, 1, 1};
        int[][] test8 = {{1, 2}, {3, 2}};
        int solution4 = solution(test7, 5, test8);
        System.out.println("solution4 = " + solution4); // 3

        int[] test11 = {3, 10, 1};
        int[][] test12 = {{1, 5}, {3, 5}};
        int solution5 = solution(test11, 100, test12);
        System.out.println("solution5 = " + solution5);

        int[] test13 = {3, 1, 10};
        int[][] test14 = {{1, 5}, {3, 5}};
        int solution6 = solution(test13, 100, test14);
        System.out.println("solution6 = " + solution6);
    }


    public static int solution(int[] bandage, int health, int[][] attacks) {
        int tempHealth = health;
        int bandCount = 0;
        int standValue = 0;
        int standAttackTime = attacks[standValue][0];
        int lastAttackTime = attacks[attacks.length - 1][0];


        for (int i = 1; i <= lastAttackTime; i++) {
            if (tempHealth <= 0) {
                break;
            }
            if (tempHealth > health) {
                tempHealth = health;
            }

            bandCount++;

            if (i == standAttackTime) {
                tempHealth -= attacks[standValue][1];
                bandCount = 0;
                standValue++;
                if (standValue == attacks.length) {
                    standValue = attacks.length - 1;
                }
                standAttackTime = attacks[standValue][0];
            } else {
                tempHealth += bandage[1];
                if (bandCount == bandage[0]) {
                    tempHealth += bandage[2];
                    bandCount = 0;
                }
            }
        }

        int answer;
        if (tempHealth <= 0) {
            answer = -1;
        } else {
            answer = tempHealth;
        }
        return answer;
    }
}
