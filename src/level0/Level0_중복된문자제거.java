package level0;

public class Level0_중복된문자제거 {
    public static void main(String[] args) {
        String solution1 = solution("people");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("We are the world");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string) {
        String answer = "";
        for(int i = 0 ; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(!answer.contains(String.valueOf(ch))){
                answer += ch;
            }
        }
        return answer;
    }
}
