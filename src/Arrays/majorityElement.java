package Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

import static java.util.Collections.swap;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,2,3};
        System.out.println(ans1(arr));
    }

    private static ArrayList<Integer> ans1(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();

        int n = arr.length;
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=i; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count > n/3){
                if(al.size()==0 || arr[i] != al.get(0)){
                    al.add(arr[i]);
                }
            }
            if(al.size() == 2){
                if(al.get(1) < al.get(0)){
                    swap(al,0,1);
                }
            }
        }
        return al;
    }

    private static int ans(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int middle=arr[n/2];
        int count=0;
        for(int i: arr){
            if(i == middle){
                count++;
            }
            if(count > n/2){
                return i;
            }
        }
        return -1;
    }
}
