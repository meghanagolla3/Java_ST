package Math;

public class happyNum {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(ans(n));
    }

    private static boolean ans(int n) {
        int sum = 0;
        while(n>0){

            int b = n % 10;

            sum += b*b;
            n = n/ 10;
            if(sum == 1){
                return true;
            }
        }

        if(n % 10 == 0){
            return false;
        }

        return true;
    }
}
