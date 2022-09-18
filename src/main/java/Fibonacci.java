import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Enter a value to get fibonacci series");
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();

            System.out.println("Fibonacci series for the number " + x +" is as follows:");
        int a = 0;
        int b = 1;
        int c;

        for(int i = 0; i<x; i++)
        {
            System.out.print(a +" ");
            c = a+b;
            a=b;
            b=c;
        }
    }

}
