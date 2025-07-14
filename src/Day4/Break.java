package Day4;

public class Break {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++){
            if(i == 6){
                System.out.println("Breaking at: "+i);
                break;
            }
            System.out.print(i +" ");
        }
    }
}
