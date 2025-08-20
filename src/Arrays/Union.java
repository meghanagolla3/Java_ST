package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] a= {2, 2, 3, 4, 5};
        int[] b= {1, 1, 2, 3, 4};
        System.out.println(ans1(a,b));
    }

    private static ArrayList<Integer> ans1(int[] a, int[] b) {
        ArrayList<Integer> al = new ArrayList<>();
        int i= a[0];
        int j= b[0];
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                al.add(a[i]);
                i++;
                j++;
            }else if(a[i] > b[j]){
                al.add(b[j]);
                j++;
            }else{
                al.add(a[i]);
                i++;
            }
            if(a[i-1]==a[i]){
                i++;
            }
            if(b[j-1]==b[j]){
                j++;
            }
        }
        return al;
    }
}
