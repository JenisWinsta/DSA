
public class function {

    public static void prime_range(int n) {
        boolean result;

        for (int i = 2; i <= n; i++) {
            result=isPrime(i);
            if(result){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int p){
        if(p==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(p);i++){
            if(p%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void binaryToDecimal(int n){
        int lastdigit, counter=0;
        int decimal=0;
        while(n>0){
            lastdigit=n%10;
            decimal=decimal+(lastdigit* (int)Math.pow(2,counter));

            n=n/10;
            counter++;
        }
        System.out.println(decimal);
    }

    public static void decimalToBinary(int n){
        
    }

    public static void main(String[] args) {

        // prime_range(20);
        binaryToDecimal(1010);
        decimalToBinary(10);

    }
}
