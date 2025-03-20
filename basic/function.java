
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
        int binary=0;
        int pow=0;
        // int last{digit=0;
        while(n>0){
            // System.out.print("binary before: "+binary);
            binary= binary +((n%2)*(int)Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        System.out.print(binary);
    }

    public static int reverse(int n){
        int reverse=0;
        while(n>0){
            reverse=reverse*10+(n%10);
            n=n/10;
        }
        System.out.println(reverse);
        return reverse;
    }

    public static void palindrome(int n){
        int reverse=reverse(n);
        if(n==reverse){
            System.out.println(n+"is a Palindrome!!");
        }
        else{
            System.out.println(n+" is Not a palindrome");
        }

    }



    public static void main(String[] args) {

        // prime_range(20);
        // binaryToDecimal(1010);
        // decimalToBinary(2);
        palindrome(121);

    }
}
