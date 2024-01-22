package _java.level0;

public class Level0_영어가싫어요 {
    public static void main(String[] args) {
        long solution1 = solution("onetwothreefourfivesixseveneightnine");
        System.out.println("solution2 = " + solution1);

        long solution2 = solution("onefourzerosixseven");
        System.out.println("solution2 = " + solution2);
    }

    public static long solution(String numbers) {
        String[] numberStrArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberStrArray.length; i++) {
            numbers = numbers.replace(numberStrArray[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
