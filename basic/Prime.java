
public class Prime {

    public static void main(String[] args) {
        int n = 113;
        int i = 2;
        boolean isPrime = true;
        while (i <= Math.sqrt(n) ) {
            if (n % i == 0) {
                System.out.println("Not a prime");
                isPrime = false;
                break;
            }
            i++;
        }
 
        if (isPrime) {
            System.out.println("Prime!!");
        }
    }
}
