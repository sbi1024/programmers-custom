package level0;

public class Level0_다항식더하기 {
    public static void main(String[] args) {
        String solution1 = solution("3x + 7 + x");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("x + x + x");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String polynomial) {
        String answer = "";

        String[] polynomialSplit = polynomial.split(" ");

        int xNum = 0;
        int notXNum = 0;


        for (String poly : polynomialSplit) {
            if (!poly.equals("+")) {
                if (poly.contains("x")) {
                    String replacePoly = poly.replace("x", "");
                    if (replacePoly.equals("")) {
                        xNum += 1;
                    } else {
                        xNum += Integer.parseInt(replacePoly);
                    }
                } else {
                    notXNum += Integer.parseInt(poly);
                }
            }
        }

        if (xNum == 0) {
            if (notXNum == 0) {
                answer = "";
            } else {
                answer = String.valueOf(notXNum);
            }
        } else if (xNum == 1) {
            if (notXNum == 0) {
                answer = "x";
            } else {
                answer = "x" + " + " + notXNum;
            }
        } else {
            if (notXNum == 0) {
                answer = xNum + "x";
            } else {
                answer = xNum + "x" + " + " + notXNum;
            }
        }
        return answer;
    }
}
