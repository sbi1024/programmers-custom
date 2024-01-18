package level1;

import java.util.Arrays;

public class Level1_공원산책 {
    public static void main(String[] args) {
        String[] test1 = {"SOO", "OOO", "OOO"};
        String[] test2 = {"E 2", "S 2", "W 1"};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [2,1]

        String[] test3 = {"SOO", "OXX", "OOO"};
        String[] test4 = {"E 2", "S 2", "W 1"};
        int[] solution2 = solution(test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [0,1]

        String[] test5 = {"OSO", "OOO", "OXO", "OOO"};
        String[] test6 = {"E 2", "S 3", "W 1"};
        int[] solution3 = solution(test5, test6);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // [0,0]
    }
    // S : 시작점
    // X : 장애물
    // O : 빈 공간

    // N : 북쪽
    // S : 남쪽
    // W : 서쪽
    // E : 동쪽
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};

        int startX = 0;
        int startY = 0;
        for (int i = 0; i < park.length; i++) {
            char[] chars = park[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'S') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }
        
        // 공원을 벗어나는지, 가는도중에 장애물을 만났는지
        
        
        return answer;
    }

    
}
