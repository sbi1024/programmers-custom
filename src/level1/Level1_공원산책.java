package level1;

import java.util.Arrays;

public class Level1_공원산책 {
    // TODO 좌표문제는 항상 이런식이야,, 날 힘들게 해 항상 코드 길어지고 더러워지고 나쁜넘
    public static void main(String[] args) {
        String[] test1 = {
                "SOO",
                "OOO",
                "OOO"
        };
        String[] test2 = {"E 2", "S 2", "W 1"};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [2,1]

        String[] test3 = {
                "SOO",
                "OXO",
                "OOX"
        };
        String[] test4 = {"E 2", "S 2", "W 1"};
        int[] solution2 = solution(test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [0,1]

        String[] test5 = {
                "OSO",
                "OOO",
                "OXO",
                "OOO"
        };
        String[] test6 = {"E 2", "S 3", "W 1"};
        int[] solution3 = solution(test5, test6);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // [0,0]
    }


    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        char[][] tempParkArray = new char[park.length][park[0].length()];
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < park.length; i++) {
            char[] chars = park[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'S') {
                    startX = i;
                    startY = j;
                    tempParkArray[i][j] = 'O';
                } else {
                    tempParkArray[i][j] = chars[j];
                }
            }
        }

        for (String route : routes) {
            String[] routeSplit = route.split(" ");
            String direction = routeSplit[0];
            String moveCount = routeSplit[1];
            if (checkOutOfPark(startX, startY, tempParkArray, direction, moveCount)) {
                if (checkMeetObstacle(startX, startY, tempParkArray, direction, moveCount)) {
                    int count = Integer.parseInt(moveCount);
                    switch (direction) {
                        case "N":
                            startX -= count;
                            break;
                        case "S":
                            startX += count;
                            break;
                        case "W":
                            startY -= count;
                            break;
                        case "E":
                            startY += count;
                            break;
                    }
                }
            }
        }
        answer[0] = startX;
        answer[1] = startY;

        return answer;
    }

    public static boolean checkOutOfPark(int startX, int startY, char[][] tempParkArray, String direction, String moveCount) {
        int count = Integer.parseInt(moveCount);
        int maxRowCount = tempParkArray.length;
        int maxColCount = tempParkArray[0].length;

        switch (direction) {
            case "N":
                if (startX - count < 0) {
                    return false;
                }
                break;
            case "S":
                if (startX + count > maxRowCount - 1) {
                    return false;
                }
                break;
            case "W":
                if (startY - count < 0) {
                    return false;
                }
                break;
            case "E":
                if (startY + count > maxColCount - 1) {
                    return false;
                }
                break;
        }
        return true;
    }

    public static boolean checkMeetObstacle(int startX, int startY, char[][] tempParkArray, String direction, String moveCount) {
        int count = Integer.parseInt(moveCount);
        switch (direction) {
            case "N":
                for (int i = startX; i >= startX - count; i--) {
                    char ch = tempParkArray[i][startY];
                    if (ch == 'X') {
                        return false;
                    }
                }
                break;
            case "S":
                for (int i = startX; i <= startX + count; i++) {
                    char ch = tempParkArray[i][startY];
                    if (ch == 'X') {
                        return false;
                    }
                }
                break;
            case "W":
                for (int i = startY; i >= startY - count; i--) {
                    char ch = tempParkArray[startX][i];
                    if (ch == 'X') {
                        return false;
                    }
                }
                break;
            case "E":
                for (int i = startY; i <= startY + count; i++) {
                    char ch = tempParkArray[startX][i];
                    if (ch == 'X') {
                        return false;
                    }
                }
                break;
        }
        return true;
    }


}
