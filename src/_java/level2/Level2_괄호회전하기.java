package _java.level2;

import java.util.Stack;

public class Level2_괄호회전하기 {
    // TODO 맞추긴 했는데, 찜찜허게 맞춘거 같다..
    // TODO 중간에 탈출할수 있는 조건이 더 있을거 같은데, 탐구가 필요해 보인다.
    // TODO 시간초를 어디서 더 줄일 수 있을지 탐구 작업 반드시 필요, 시간소요가 너무 오래 됨
    public static void main(String[] args) {
        int solution1 = solution("[](){}");
        System.out.println("solution1 = " + solution1); // 3

        int solution2 = solution("}]()[{");
        System.out.println("solution2 = " + solution2); // 2

        int solution3 = solution("[)(]");
        System.out.println("solution3 = " + solution3); // 0

        int solution4 = solution("}}}");
        System.out.println("solution4 = " + solution4); // 0
    }

    public static int solution(String s) {
        int answer = 0;

        char ch1 = '(';
        char ch2 = ')';
        char ch3 = '[';
        char ch4 = ']';
        char ch5 = '{';
        char ch6 = '}';

        for (int i = 0; i < s.length(); i++) {
            char[] chars = s.toCharArray();
            char firstChar = chars[0];
            char lastChar = chars[chars.length - 1];
            if (!(firstChar == ch2 || firstChar == ch4 || firstChar == ch6 || lastChar == ch1 || lastChar == ch3 || lastChar == ch5)) {
                Stack<Character> stack = new Stack<>();
                for (char ch : chars) {
                    if (stack.isEmpty()) {
                        stack.push(ch);
                    } else {
                        Character peek = stack.peek();
                        if (peek.equals(ch1)) {
                            if (ch == ch2) {
                                stack.pop();
                            } else {
                                stack.push(ch);
                            }
                        } else if (peek.equals(ch3)) {
                            if (ch == ch4) {
                                stack.pop();
                            } else {
                                stack.push(ch);
                            }
                        } else if (peek.equals(ch5)) {
                            if (ch == ch6) {
                                stack.pop();
                            } else {
                                stack.push(ch);
                            }
                        } else {
                            stack.push(ch);
                        }
                    }
                }
                if (stack.isEmpty()) {
                    answer++;
                }
            }
            StringBuilder sb = new StringBuilder();
            String substring = s.substring(1);
            char firstCharAtValue = s.charAt(0);
            s = sb.append(substring).append(firstCharAtValue).toString();
        }

        return answer;
    }
}
