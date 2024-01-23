package _java.level2;

public class Level2_다음큰숫자 {
    // TODO Integer.bitCount 메소드를 새로알게되었다.
    public static void main(String[] args) {
        int solution1 = solution(78);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(15);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        int standLength = checkOneLength(n);
        int anotherIndex = n + 1;
        while (standLength != checkOneLength(anotherIndex)) {
            anotherIndex++;
        }
        return anotherIndex;
    }

    public static int checkOneLength(int n) {
        String originNumBinary = Integer.toString(n, 2);

        int originNumBinaryLength = originNumBinary.length();
        int originNumBinaryZeroLength = originNumBinary.replace("1", "").length();
        int oneLength = originNumBinaryLength - originNumBinaryZeroLength;

        return oneLength;
    }

    public static int solution2(int n) {
        int standCount = Integer.bitCount(n);
        int index = n + 1;
        while (standCount != Integer.bitCount(index)) {
            index++;
        }
        return index;
    }



}
