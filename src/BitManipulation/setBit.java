package BitManipulation;

public class setBit {
    public static void main(String[] args) {
        System.out.println(ans(7));
    }
    public static int ans(int n){
        int pos =4;
        int bitMask = 1<< (pos-1);
        int ans = n | bitMask;
        return ans;
    }
}
