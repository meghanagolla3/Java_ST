package Arrays;

public class duplicatesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int count =1;
        int first = 0;
        int second = first+1;
        while(second < arr.length){ 
            if(arr[first] == arr[second]){
                count++;
                second++;
            }else{
                first++;
                second++;
            }
        }

        return count;
    }
}
