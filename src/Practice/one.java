package Practice;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(Arrays.toString(ans(n)));
    }

    private static int[] ans(int n) {
//        int i = 2;
        int a = 1;
        int b = n-1;
        while (a < n) {
            if (isNoZero(a) && isNoZero(b)) {
                return new int[]{a, b};
            }
            a++;
            b--;
        }

        return new int[]{a, b};
    }
    private static boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return false; // contains 0
            num /= 10;
        }
        return true;
    }
}
