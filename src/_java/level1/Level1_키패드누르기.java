package _java.level1;

public class Level1_키패드누르기 {
    // TODO 이번것도 잘 푼거는 같다, 방향성도 괜찮았는데, 막상 다 풀고 나서 보니까 Switch 문이었으면 더 좋았을거 같다는 생각이 든다.
    public static void main(String[] args) {
        int[] test1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] test2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        int[] test3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        String solution1 = solution(test1, "right");
        System.out.println("solution1 = " + solution1); // LRLLLRLLRRL // LRLLLRLLRRL

        String solution2 = solution(test2, "left");
        System.out.println("solution2 = " + solution2); // LRLLRRLLLRR // LRLRLRLLLRR

        String solution3 = solution(test3, "right");
        System.out.println("solution3 = " + solution3); // LLRLLRLLRL
    }

    public static String solution(int[] numbers, String hand) {
        StringBuffer sb = new StringBuffer();

        int[] leftPosition = {3, 0};
        int[] rightPosition = {3, 2};
        int[] middlePosition = new int[2];

        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                leftPosition[0] = number / 3;
                leftPosition[1] = 0;
                sb.append("L");
            } else if (number == 3 || number == 6 || number == 9) {
                rightPosition[0] = (number / 3) - 1;
                rightPosition[1] = 2;
                sb.append("R");
            } else {
                middlePosition[0] = number == 0 ? 3 : (number / 3);
                middlePosition[1] = 1;

                int leftDistance = Math.abs(leftPosition[0] - middlePosition[0]) + Math.abs(leftPosition[1] - middlePosition[1]);
                int rightDistance = Math.abs(rightPosition[0] - middlePosition[0]) + Math.abs(rightPosition[1] - middlePosition[1]);

                if (leftDistance < rightDistance) {
                    leftPosition[0] = middlePosition[0];
                    leftPosition[1] = middlePosition[1];
                    sb.append("L");
                } else if (leftDistance == rightDistance) {
                    if (hand.equals("left")) {
                        leftPosition[0] = middlePosition[0];
                        leftPosition[1] = middlePosition[1];
                        sb.append("L");
                    } else {
                        rightPosition[0] = middlePosition[0];
                        rightPosition[1] = middlePosition[1];
                        sb.append("R");
                    }
                } else {
                    rightPosition[0] = middlePosition[0];
                    rightPosition[1] = middlePosition[1];
                    sb.append("R");
                }
            }
        }

        return sb.toString();
    }


}
