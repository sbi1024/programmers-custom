package _java.level2;

import java.util.Stack;

public class Level2_짝지어제거하기 {
    // TODO String으로 하지말고 Char로 하자
    public static void main(String[] args) {
        int solution1 = solution("baabaa");
        System.out.println("solution1 = " + solution1); // 1

        int solution2 = solution("cdcd");
        System.out.println("solution2 = " + solution2); // 0
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (stack.size() == 0) {
                stack.push(ch);
            } else {
                if (stack.peek() == ch) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        if (stack.size() == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
