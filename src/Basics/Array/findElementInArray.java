package Basics.Array;

import java.util.Scanner;

// This program simply finds the inputted value in the array and provides its index.
public class findElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elements : ");
        for (int i = 0; i <= arr.length-1; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Now! Enter the number you want to find : ");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i <= arr.length-1; i++ ){
            if (arr[i] == num) System.out.println(num +" found at index - " + i );
            index = i;
        }
        if (index == -1) System.out.println("Element not found ! ");

    }
}
