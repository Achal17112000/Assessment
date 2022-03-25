package Tasks;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int revarr[] = new int[n];
        System.out.println("Reverse Array is:");
        for(int i = arr.length-1, j=0; i>=0; i--, j++) {
            revarr[j] = arr[i];
            System.out.println(revarr[j]);

        }
    }
}
