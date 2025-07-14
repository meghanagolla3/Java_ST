package Day1Day2;

public class TypeCasting {
    public static void main(String[] args) {
        int num = 12;
        float fnum = 3.11f;
        String snum = "45";

        float ffnum = num; //implicitly
        int i = (int)fnum; //explicitly
        int ssnum = Integer.parseInt(snum); //String to integer
        System.out.println(ffnum);
        System.out.println(i);
        System.out.println(ssnum);

    }
}
