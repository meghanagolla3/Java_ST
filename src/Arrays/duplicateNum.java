package Arrays;

public class duplicateNum {
    public static void main(String[] args) {
        int[] arr ={1,3,4,2,2};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int n = arr.length;
        int freq[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (freq[arr[i]] == 0) {
                freq[arr[i]] += 1;
            } else {
                return arr[i];
            }
        }
        return 0;
    }
}
