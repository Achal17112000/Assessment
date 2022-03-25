package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Sorted Array is:");
        for(int a: arr) {
            System.out.println(a);
        }

        //Manually
        System.out.println("Manually Sorted Array:");
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n-1; j++) {
                int tmp = 0;
                if(arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
