package java.level0;

public class Level0_치킨쿠폰 {
    public static void main(String[] args) {
        int solution1 = solution(100);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(1081);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int chicken) {
        int answer = 0;

        int coupon = chicken;
        while (coupon >= 10) {
            int serviceCoupon = coupon / 10;
            answer += serviceCoupon;
            coupon = serviceCoupon + (coupon % 10);
        }

        return answer;
    }
}
