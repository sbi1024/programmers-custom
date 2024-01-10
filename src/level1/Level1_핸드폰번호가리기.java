package level1;

public class Level1_핸드폰번호가리기 {
    public static void main(String[] args) {
        // TODO 배열로 변환해서 풀어보기, 정규식으로 처리가능한지 확인해보기
        String solution1 = solution("01033334444");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("027778888");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String phone_number) {
        StringBuffer sb = new StringBuffer();
        int index = phone_number.length() - 4;
        String notStarStr = phone_number.substring(index);
        int starLength = phone_number.substring(0, index).length();
        for (int i = 0; i < starLength; i++) {
            sb.append("*");
        }
        sb.append(notStarStr);
        return sb.toString();
    }
}
