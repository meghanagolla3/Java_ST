package BitManipulation;
import java.util.*;




public class one {
    public static String convert2Binary(int n){
        String res ="";
        while(n != 1) {
            if(n%2 == 1) res = res+'1';
            else res = res+'0';
            n=n/2;
        }
//        res.reverse();
        return res;
    }
    public static void main(String[] args) {
        System.out.println(convert2Binary(2));
    }
}
