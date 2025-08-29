package Strings;

public class validPalindrome {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(ans(s));
    }

    private static boolean ans(String s) {
        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = s1.length()-1;
        while(start < end){
            if(s1.charAt(start) == s1.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
