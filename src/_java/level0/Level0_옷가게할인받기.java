package _java.level0;

public class Level0_옷가게할인받기 {
    public static void main(String[] args) {
        int solution1 = solution(150000);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(580000);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int price) {
        double calPercent = 1;
        if (price >= 500000) {
            calPercent = 0.8;
        }
        else if (price >= 300000) {
            calPercent = 0.9;
        }
        else if (price >= 100000) {
            calPercent = 0.95;
        }
        return (int) (price * calPercent);
    }

    public static int solution1(int price) {
        if (price >= 500000) {
            price *= 0.8;
        } else if (price >= 300000) {
            price *= 0.9;
        } else if (price >= 100000) {
            price *= 0.95;
        }
        return price;
    }
}
