package Tasks;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int MIN = arr[0];
        int MAX = arr[0];
        for(int i=0; i<n; i++) {
            if(MIN > arr[i])
                MIN = arr[i];
            if(MAX < arr[i])
                MAX = arr[i];
        }
        System.out.println("MIN VALUE:" + MIN);
        System.out.println("MAX VALUE:" + MAX);


    }



}
