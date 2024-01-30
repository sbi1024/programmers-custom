package _java.level2;

import java.util.Arrays;

public class Level2_전화번호목록 {
    // TODO 기본정렬이 무엇인가? 사전순 정렬이 무엇을 뜻하는가 확인이 필요하다

    public static void main(String[] args) {
        String[] test1 = {"119", "97674223", "1195524421"};
        boolean solution1 = solution(test1);
        System.out.println("solution1 = " + solution1); // false

        String[] test2 = {"123", "456", "789"};
        boolean solution2 = solution(test2);
        System.out.println("solution2 = " + solution2); // true

        String[] test3 = {"12", "123", "1235", "567", "88"};
        boolean solution3 = solution(test3);
        System.out.println("solution3 = " + solution3); // false

        String[] test4 = {"12", "1", "1235", "567", "88"};
        boolean solution4 = solution(test4);
        System.out.println("solution4 = " + solution4); //
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].indexOf(phone_book[i]) == 0) {
                return false;
            }
        }

        return answer;
    }


//    public static boolean solution(String[] phone_book) {
//        boolean answer = true;
//
//        Arrays.sort(phone_book);
//
//        Map<Integer, String> map = new HashMap<>();
//        for (int i = 0; i < phone_book.length; i++) map.put(i + 1, phone_book[i]);
//        for (int i = 0; i < map.size() - 1; i++) {
//            String standValue = map.get(i + 1);
//            String anotherValue = map.get(i + 2);
//            if (anotherValue.indexOf(standValue) == 0) {
//                return false;
//            }
//        }
//
//        return answer;
//    }
}
