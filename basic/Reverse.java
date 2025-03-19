
import java.util.Scanner;

//print the reverse of a number
// n= 10899  ======> 99801

public class Reverse{
    public static void main(String args[]){
        System.out.print("Enter a no.");
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int reverse=0;
        int temp;
        while(input>0){
            temp=input%10;
            reverse =(reverse*10)+temp ;
            input=input/10;
        }
        System.out.println(reverse);
    }
}