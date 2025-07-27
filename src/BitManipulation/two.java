package BitManipulation;

import static java.lang.Integer.parseInt;

public class two {
    public static int numberOfSet(int n){
        String a = Integer.toBinaryString(n);
        System.out.println(a);
        int count=0;
        for(int i=0; i<a.length();i++){
            if(a.charAt(i)=='1') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numberOfSet(6));
    }
}
