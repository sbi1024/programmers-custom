package level1;

import java.util.LinkedList;
import java.util.Queue;

public class Level1_문자열나누기 {
    // TODO 실패함 도저히 모르겠는데 ?
    public static void main(String[] args) {
        int solution1 = solution("banana");
        System.out.println("solution1 = " + solution1); // 3
        int solution2 = solution("abracadabra");
        System.out.println("solution2 = " + solution2); // 6
        int solution3 = solution("aaabbaccccabba");
        System.out.println("solution3 = " + solution3); // 3
        int solution4 = solution("aaaabbbcaaaa");
        System.out.println("solution4 = " + solution4); // 2
        int solution5 = solution("abaaaabb");
        System.out.println("solution5 = " + solution5); // 2
        int solution6 = solution("abaabab");
        System.out.println("solution6 = " + solution6);
    }

    public static int solution(String s) {
        int answer = 0;

        Queue<Character> queue = new LinkedList<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            queue.add(aChar);
        }
        while (queue.size() > 0) {
            int matchCount = 1;
            int nonMatchCount = 0;
            char standChar = queue.poll();
            if (queue.size() == 0) {
                answer++;
                return answer;
            }
            for (int i = 0; i < queue.size(); i++) {
                Character anotherChar = queue.poll();
                if (standChar == anotherChar) {
                    matchCount++;
                } else {
                    nonMatchCount++;
                }
                if (matchCount == nonMatchCount) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
