import java.util.*;
class Main {
    public static int main(String[] args) {
        int sum=0;
        int r;
        int x=123;

        while(x>0||x<0){
            r = x%10;

            sum = sum*10+r;
            x = x/10;
        }
        if(sum>Integer.MAX_VALUE /10 || (sum == Integer.MAX_VALUE /10 && x>7)) return 0;
        if(sum<Integer.MIN_VALUE /10|| (sum == Integer.MIN_VALUE/10 && x<-8)) return 0;


        return sum;
    }
}