package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "abcdefg";
        char[] s = s1.toCharArray();
        ans(s);
        System.out.println(ans1(s2,4));
    }
    //bacdfeg

    public static void reverse(char[] s, int left, int right){
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    private static String ans1(String s2,int k) {
        char[] s = s2.toCharArray();
        int left = 0;
        while (left < s.length) {
            int right = Math.min(left + k - 1, s.length-1);
            reverse(s,left,right);
            left = left + k + k;
        }


        String reverse = new String(s);
        return reverse;
    }

    private static void ans(char[] s) {
//        System.out.println(Arrays.toString(s));
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }

}
