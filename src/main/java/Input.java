import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner scr = new Scanner(System.in);
        String str;
        str = scr.nextLine();
        System.out.println("Entered name is: "+str);
    }
}
