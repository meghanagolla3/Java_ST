package BitManipulation;

public class uniqueEleInArr {
    public static void main(String[] args) {
        int[] arr ={2,3,4,2,7,6,4,3};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {
        int unique=0;
        for(int n : arr){
            unique = unique^n;
        }
        return unique;
    }
}
