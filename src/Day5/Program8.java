package Day5;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Program8 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int findNthPrime(int n){
        if(n==1)
        {
            return 2;
        }

        int i=1;
        int count=1;
        while(count != n){
            i+=2;
            if(isPrime(i))
                count++;
        }

        return i;
    }
    public static void main(String[] args) {
        int difference = findNthPrime(3) - findNthPrime(7);
        int absDiff= Math.abs(difference);
        System.out.println(absDiff);
        int sum = 0;
        for(int i=1; i<=absDiff; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
