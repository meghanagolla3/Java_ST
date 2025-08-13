package BitManipulation;

public class four {
    public static boolean twoPowerBit(int n) {
        if ((n & (n - 1)) == 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(twoPowerBit(5 ));
    }
}
