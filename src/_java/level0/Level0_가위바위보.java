package _java.level0;

public class Level0_가위바위보 {
    public static void main(String[] args) {
        String solution1 = solution("2");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("205");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String rsp) {
        String answer = "";
        String[] splitRsp = rsp.split("");
        for (String spl : splitRsp) {
            if (spl.equals("2")) {
                answer += "0";
            } else if (spl.equals("0")) {
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}
