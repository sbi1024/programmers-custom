package level1;

import java.util.Arrays;

public class Level1_자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        int[] solution1 = solution(12431);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(long n) {
        return Arrays.stream(new StringBuffer().append(n).reverse().toString().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
