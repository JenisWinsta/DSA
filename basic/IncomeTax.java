import java.util.*;

public class IncomeTax{
    public static void main(String args[]){
        System.out.print("hello world!");
        Scanner sc = new Scanner(System.in);
        float tax;
        System.out.println("\nEnter income");
        int income = sc.nextInt();
        if(income<500000){
            System.out.println("Income < 5L\nNo Tax!!");
        }
        else if(income<=1000000){
            tax=0.2f*income;
            System.out.println("Income btw 5L - 10L\nTax: "+tax);
        }
        else{
            tax= 0.3f*income;
            System.out.println("Income >10L\nTax: "+tax);
        }

    }
}