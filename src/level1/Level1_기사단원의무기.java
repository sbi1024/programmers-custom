package level1;

public class Level1_기사단원의무기 {
    // TODO 약수와 소수 최대공약수 최대공배수 개념에 대한 정리가 필요해 보인다.
    public static void main(String[] args) {
        int solution1 = solution(5, 3, 2);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(10, 3, 2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int[] numberArray = new int[number];
        for (int i = 1; i <= number; i++) {
            int check = checkCount(i);
            numberArray[i - 1] = check > limit ? power : check;
        }
        for (int i = 0; i < numberArray.length; i++) {
            answer += numberArray[i];
        }
        return answer;
    }

    public static int checkCount(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        int pow = (int) Math.pow(sqrt, 2);
        return pow == n ? count * 2 - 1 : count * 2;
    }
}
