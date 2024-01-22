package _java.level0;

import java.util.Scanner;
public class Level0_대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] charArray = a.toCharArray();
        for (char ch : charArray) {
            if(Character.isUpperCase(ch)){
                sb.append(String.valueOf(ch).toLowerCase());
            } else {
                sb.append(String.valueOf(ch).toUpperCase());
            }
        }
        System.out.println(sb);
    }


}
