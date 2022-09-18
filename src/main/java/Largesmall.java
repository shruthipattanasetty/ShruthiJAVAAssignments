import java.util.Scanner;

public class Largesmall {
    public static void main(String[] args) {
        int n,largest,smallest;
        Scanner scr =new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        n = scr.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i] = scr.nextInt();
        }
        largest = a[0];
        smallest = a[0];

        for(int i = 0;i<n;i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        for(int i = 0;i<n;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("Largest number is: "+largest);
        System.out.println("Smallest number is: "+smallest);
    }
}

