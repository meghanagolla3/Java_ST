package Day4;

public class Functions {
    public static int max(int a, int b){
        if(a>b) return a;
        else return b;
    }

    public static void printTable(int n){
        for(int i = 1; i <= 10; i++){
            System.out.print(n*i +" ");
        }
        System.out.println();
    }

    public static int getSquare(){
        int i = 9;
        return i*i;
    }

    public static void showMessage(){
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        System.out.println("Greater is:"+max(10,20));
        printTable(5);
        System.out.println("Square is: "+getSquare());
        showMessage();
    }
}
