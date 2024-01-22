package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level0_리스트자르기 {
    public static void main(String[] args) {
        int n1 = 3;
        int[] test1 = {1, 5, 2};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] solution1 = solution(n1, test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int n2 = 4;
        int[] test3 = {1, 5, 2};
        int[] test4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] solution2 = solution(n2, test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));


        int n3 = 2;
        int[] test5 = {1, 5, 2};
        int[] test6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] solution3 = solution(n3, test5, test6);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));

        int n4 = 4;
        int[] test7 = {2, 7, 3};
        int[] test8 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] solution4 = solution(n4, test7, test8);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        List<Integer> listNumList = Arrays.stream(num_list).boxed().collect(Collectors.toList());

        switch (n) {
            case 1:
                return listNumList.subList(0, b + 1).stream().mapToInt(Integer::intValue).toArray();
            case 2:
                return listNumList.subList(a, num_list.length).stream().mapToInt(Integer::intValue).toArray();
            case 3:
                return listNumList.subList(a, b + 1).stream().mapToInt(Integer::intValue).toArray();
            case 4:
                List<Integer> subStrList = listNumList.subList(a, b + 1);
                List<Integer> tempList = new ArrayList<>();
                for(int i = 0 ; i < subStrList.size(); i ++){
                    if(i % c == 0){
                        tempList.add(subStrList.get(i));
                    }
                }
                return tempList.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}
