package java.level0;

import java.util.Scanner;

public class Level0_문자열반복해서출력하기 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){
            sb.append(str);
        }
        System.out.println(sb);
    }
}
