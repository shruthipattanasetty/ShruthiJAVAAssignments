import java.util.Scanner;

public class Vowelcount {
    public static void main(String[] args){
        System.out.println("Enter your string");
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        int count = 0;

        for(char c:str.toCharArray()){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            count++;
        }
        }
        System.out.println("Number of vowels in the string = " +count);
    }
}
