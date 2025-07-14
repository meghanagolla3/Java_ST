package Day4;

public class Largest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if(a > b && a > c){
            System.out.println("Largest is: "+a);
        }else if(b>c){
            System.out.println("Largest is: "+b);
        }else{
            System.out.println("Largest is: "+c);
        }
    }
}
