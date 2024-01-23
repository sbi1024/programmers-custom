package _java.level2;

import java.util.Stack;

public class Level2_올바른괄호 {
    // TODO Stack으로 푸는 방향성은 좋았으나, 효율성 코드에서 계속 실패했었음 로직흐름에 대한 전체구조를 좀더 자세히 봐야 함
    
    public static void main(String[] args) {
        boolean solution1 = solution("()()");
        System.out.println("solution1 = " + solution1); // true

        boolean solution2 = solution("(())()");
        System.out.println("solution2 = " + solution2); // true

        boolean solution3 = solution(")()(");
        System.out.println("solution3 = " + solution3); // false

        boolean solution4 = solution("(()(");
        System.out.println("solution4 = " + solution4); // false

        boolean solution5 = solution("(()))))");
        System.out.println("solution5 = " + solution5); // false

        boolean solution6 = solution("((()");
        System.out.println("solution6 = " + solution6); // false
    }
    
    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.size() == 0) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean solution1(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();
        String[] splitStr = s.split("");
        for (String str : splitStr) {
            if (stack.size() == 0) {
                stack.push(str);
                if (stack.peek().equals(")")) {
                    break;
                }
            } else {
                String peek = stack.peek();
                if (peek.equals(str)) {
                    stack.push(str);
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {
            answer = false;
        }

        return answer;
    }
    
    public static boolean solution2(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();
        String[] splitStr = s.split("");
        stack.push(splitStr[0]);
        for (int i = 1; i < splitStr.length; i++) {
            String str = splitStr[i];
            if (stack.peek().equals(")")) {
                break;
            } else {
                String peek = stack.peek();
                if (peek.equals(str)) {
                    stack.push(str);
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {
            answer = false;
        }

        return answer;
    }
}
