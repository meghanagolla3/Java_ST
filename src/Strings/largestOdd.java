package Strings;

public class largestOdd {
    public static void main(String[] args) {
        String num = "4206";
        System.out.println(ans(num));
    }

    private static String ans(String num) {
        int count = -1;
        int s = Integer.parseInt(num);
        if(s % 2 != 0){
            String s1 = Integer.toString(s);
            return s1;
        }
        int temp = s;
        while(temp > 0){
            int r = temp % 10;
            if(r % 2 !=0){
                if(r > count){
                    count = r;
                }
            }
            temp = temp / 10;
        }
        if(count == -1){
            return "";
        }
        String s1 = Integer.toString(count);
        return s1;
    }
}
