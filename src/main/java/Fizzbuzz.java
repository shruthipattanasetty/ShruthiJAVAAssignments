import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        System.out.println("Enter any number from 1 to 100");
        Scanner scr = new Scanner(System.in);
        int x = scr.nextInt();
        for(int i=1;i<=x;i++) {
            System.out.println(i);
        }
        System.out.println("Divided by 3");
        for (int i=1;i<=x;i++){
            if(i%3==0){
             System.out.println(i +" Fizz");
            }
        }
       System.out.println("Divided by 5");
        for (int i =1;i<=x;i++){
            if(i%5==0){
                System.out.println(i +" Buzz");
            }
        }
        System.out.println("Divided by 3 and 5");
        for(int i = 1;i<=x;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i +" FizzBuzz");
            }
        }
    }

    }

