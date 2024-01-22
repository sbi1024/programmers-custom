package _java.level0;

public class Level0_PCCE기출문제8번창고정리 {
    public static void main(String[] args) {
        String[] test1 = {"pencil", "pencil", "pencil", "book"};
        String[] test2 = {"doll", "doll", "doll", "doll"};
        String[] test3 = {"apple", "steel", "leaf", "apple", "leaf"};
        String[] test4 = {"mirror", "net", "mirror", "net", "bottle"};

        int[] test5 = {2, 4, 3, 1};
        int[] test6 = {1, 1, 1, 1};
        int[] test7 = {5, 3, 5, 3, 7};
        int[] test8 = {4,1,4,1,5};

        String solution1 = solution(test1, test5);
        System.out.println("solution1 = " + solution1); // pencil

        String solution2 = solution(test2, test6);
        System.out.println("solution2 = " + solution2); // doll

        String solution3 = solution(test3, test7);
        System.out.println("solution3 = " + solution3); // leaf

        String solution4 = solution(test4, test8);
        System.out.println("solution4 = " + solution4); // mirror
    }

    public static String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length];
        int[] clean_num = new int[num.length];

        for (int i = 0; i < storage.length; i++) {
            int clean_idx = -1;
            for (int j = 0; j < num_item; j++) {
                if (storage[i].equals(clean_storage[j])) {
                    clean_idx = j;
                    break;
                }
            }
            if (clean_idx == -1) {
                clean_storage[num_item] = storage[i];
                clean_num[num_item] = num[i];
                num_item += 1;
            } else {
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for (int i = 0; i < num_item; i++) {
            if (clean_num[i] > num_max) {
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}
