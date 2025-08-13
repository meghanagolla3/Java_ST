package BitManipulation;

public class resetBit {
    public static void main(String[] args) {
        System.out.println(ans(86));
    }

    private static int ans(int n) {
        int pos = 5;
        int bitMask = 1<<(pos-1);
        int ans = n^bitMask;
        return ans;
    }
}
