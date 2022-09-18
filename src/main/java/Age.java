import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Please enter your age");
        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();
        if (age < 13) {
            System.out.println("kid");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");

        }
    }
}