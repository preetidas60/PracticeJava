public class isarmstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
        for (int i = 100; i < 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n /= 10;
        }
        return sum == original;

    }
}