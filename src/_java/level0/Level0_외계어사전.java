package _java.level0;

import java.util.ArrayList;
import java.util.List;

public class Level0_외계어사전 {
    public static void main(String[] args) {
        String[] test1 = {"p", "o", "s"};
        String[] test2 = {"z", "d", "x"};
        String[] test3 = {"s", "o", "m", "d"};

        String[] test4 = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] test5 = {"def", "dww", "dzx", "loveaw"};
        String[] test6 = {"moos", "dzx", "smm", "sunmmo", "som"};

        int solution1 = solution(test1, test4);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, test5);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3, test6);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(String[] spell, String[] dic) {
        List<String> lengthMatchList = new ArrayList<>();
        for (int i = 0; i < dic.length; i++) {
            if (spell.length == dic[i].length()) {
                lengthMatchList.add(dic[i]);
            }
        }
        for (int i = 0; i < lengthMatchList.size(); i++) {
            List<String> useList = new ArrayList<>();
            for (int j = 0; j < spell.length; j++) {
                String str = lengthMatchList.get(i);
                if (str.contains(spell[j])) {
                    if ((str.length() - str.replace(spell[j], "").length()) == 1) {
                        useList.add("y");
                    }
                }
            }
            if (useList.size() == spell.length) {
                return 1;
            }
        }
        return 2;
    }
}
