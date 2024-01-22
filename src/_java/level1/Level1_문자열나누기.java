package _java.level1;

public class Level1_문자열나누기 {
    // TODO 실패함 도저히 모르겠는데 ? (위 풀이코드는 다른사람거 블로그 찾아온 풀이.. 도저히 아직도 이해를 못함)
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
    }

    public static int solution(String s) {
        int answer = 1;
        int matchCount = 1;
        int nonMatchCount = 0;
        int standValue = s.charAt(0) - 'a';
        for (int i = 1; i < s.length(); i++) {
            int anotherValue = s.charAt(i) - 'a';
            if (matchCount == nonMatchCount) {
                answer++;
                standValue = anotherValue;
                matchCount = 1;
                nonMatchCount = 0;
            } else {
                if (standValue == anotherValue) {
                    matchCount++;
                } else {
                    nonMatchCount++;
                }
            }
        }
        return answer;
    }
}
