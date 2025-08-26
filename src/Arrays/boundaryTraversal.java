package Arrays;

public class boundaryTraversal {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int top =0;
        int left=0;
        int right =3;
        int bottom = 3;
        for(int i=0; i< arr.length;i++){
            System.out.print(arr[top][i]+" ");
        }
        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i][right]+" ");
        }
        for(int i=arr.length-2; i>=0; i--){
            System.out.print(arr[bottom][i]+" ");
        }
        for(int i=arr.length-2; i>=1; i--){
            System.out.print(arr[i][left]+" ");
        }
    }
}
