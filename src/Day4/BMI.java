package Day4;

public class BMI {
    public static void main(String[] args) {
        int weight = 60;
        float height = 1.7f;

        double BMI= weight / (height * height);
        System.out.println("BMI = "+BMI);
    }
}
