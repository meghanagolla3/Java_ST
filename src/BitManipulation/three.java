package BitManipulation;

public class three {
    public static boolean twoPower(int n){
        int i=1;
        while(i<=n){
            if(i==n){
                return true;
            }
            i=i*2;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print(twoPower(10));
    }
}
