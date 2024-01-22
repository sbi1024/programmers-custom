package _java.level0;

public class Level0_로그인성공 {
    public static void main(String[] args) {
        String[] test1 = {"meosseugi", "1234"};
        String[][] test2 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);

        String[] test3 = {"programmer01", "15789"};
        String[][] test4 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        String solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2);

        String[] test5 = {"rabbit04", "98761"};
        String[][] test6 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        String solution3 = solution(test5, test6);
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];
        for (int i = 0; i < db.length; i++) {
            String dbId = db[i][0];
            String dbPw = db[i][1];
            if (id.equals(dbId) && pw.equals(dbPw)) {
                return "login";
            } else if (id.equals(dbId) && !pw.equals(dbPw)) {
                return "wrong pw";
            } else {
                answer = "fail";
            }
        }
        return answer;
    }
}
