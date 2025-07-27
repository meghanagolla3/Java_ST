package Practice;
import static java.lang.Integer.toBinaryString;

public class bitMask {
    public static void main(String[] args) {
        int temp=1;
        int base=2;
        int exp = 3;
        for(int i=1;i<=exp;i++){
            temp=temp*base;
        }
        System.out.println(temp);
    }

}
