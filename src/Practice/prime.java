package Practice;

public class prime {
    public static boolean Prime(int n){
        if(n==1) return false;

        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i ==0) return false;
        }
        return true;
    }

    public static void setBit(int n){
        String nBit = Integer.toBinaryString(n);
        int count=0;
        for(int i=0; i< nBit.length();i++){
            if(nBit.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void pattern(int n){
        for(int i= 1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void reverse(int n){
        int sum=0;
        int r;
        while(n>0){
            r= n%10;
            sum = (sum*10)+r;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println(Prime(5));
//        System.out.println(setBit(6));
        setBit(6);
        pattern(4);
        reverse(123);
    }
}
