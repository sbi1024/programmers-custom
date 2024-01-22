package java.level0;

import java.util.Scanner;

public class Level0_PCCE기출문제2번피타고라스의정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2));

        System.out.println(b_square);
    }
}
