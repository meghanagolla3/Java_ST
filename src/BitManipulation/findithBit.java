package BitManipulation;

public class findithBit {
    public static void main(String[] args) {
        System.out.println(ans(13));

    }

    private static int ans(int n) {
        int pos = 3;
        int bitMask = 1 << (pos -1);
        int ans = n & bitMask;
        return ans;
    }

}
