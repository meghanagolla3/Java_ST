package Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(ans(arr));
    }
    public static boolean ans(int[] arr){
        for(int i=arr.length-1 ; i>= 0; i--){
            if(i>0&&arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
