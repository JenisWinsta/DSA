package basic;

import java.util.*;

public class JavaBasic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pencil: ");
        int pencil = sc.nextInt();
        System.out.print("Pen: ");
        int pen = sc.nextInt();
        System.out.print("Eraser: ");
        int eraser = sc.nextInt();

        int sum = pencil + pen + eraser;
        System.out.println("sum: " + sum);
        float cost= sum*1.18f;
        System.out.println("Sum+gst="+cost);

    }
}
