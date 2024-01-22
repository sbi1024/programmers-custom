package java.level1;

public class Level1_문자열내p와y의개수 {
    public static void main(String[] args) {
        boolean solution1 = solution("pPoooyY");
        System.out.println("solution1 = " + solution1);

        boolean solution2 = solution("Pyy");
        System.out.println("solution2 = " + solution2);
    }

    public static boolean solution(String s) {
        int pCount = 0;
        int sCount = 0;

        String[] splitS = s.split("");
        for (String split : splitS) {
            if (split.equalsIgnoreCase("p")) {
                pCount++;
            } else if (split.equalsIgnoreCase("y")) {
                sCount++;
            }
        }

        if (pCount == sCount) {
            return true;
        } else {
            return false;
        }
    }
}
