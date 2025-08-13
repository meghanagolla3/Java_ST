package BitManipulation;

import static java.lang.Integer.toBinaryString;
//import static java.lang.StringUTF16.charAt;

import java.util.*;

public class rightMost {
    public static void main(String[] args) {
        System.out.println(ans(13));
    }
    public static String ans(int n){
        String s = toBinaryString(n);

        for(int i = s.length()-1; i>= 0; i--){
            if(s.charAt(i)=='0'){
                char ans = s.charAt(i);
                ans ='1';
                break;
            }
        }
        return s;
    }
}
