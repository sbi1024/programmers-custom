package level0;

public class Level0_수조작하기2 {
    public static void main(String[] args) {
        // [0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1] wsdawsdassw
        int[] test1 = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(int[] numLog) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numLog.length - 1; i++) {
            int result = numLog[i + 1] - numLog[i];
            switch (result) {
                case 1:
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
                    break;
            }
        }
        return sb.toString();
    }
}
