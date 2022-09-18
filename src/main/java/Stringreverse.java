import java.util.Scanner;

public class Stringreverse {
    public static void main(String[] args){
        System.out.println("Enter your string");
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        StringBuffer sr = new StringBuffer(str);
        sr.reverse();
        System.out.println("Reverse of the string entered " +sr);
    }

}
