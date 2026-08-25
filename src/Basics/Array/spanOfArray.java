package Basics.Array;

import java.util.Scanner;

// Here after accepting n number of elements in an array, this program gives a span of the largest and smallest number.
//  largest element - smallest element  = Span
public class spanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the Array: ");

        for (int i = 0; i <= n-1; i++){
            array[i] = sc.nextInt();
        }

        int largest  = array[0];
        int smallest  = array[0];
        for (int i = 1; i <= n-1; i++){
            if (array[i]>largest) largest=array[i];
            if (array[i]<smallest) smallest=array[i];
        }
        int span = largest - smallest;
        System.out.print("The Span is : " + span);
    }
}
