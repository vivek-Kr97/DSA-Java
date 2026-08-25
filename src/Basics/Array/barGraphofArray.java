package Basics.Array;

import java.util.Scanner;

/*
    for an array like [ 2, 5, 4, 3], this progam represents this at bar graph
     like -

        *
        *   *
        *   *   *
    *   *   *   *
    *   *   *   *
    --------------
    2   5   4   3

 */
public class barGraphofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.print("Enter the elements : ");
        for (int i = 0; i <= arr.length-1; i++ ){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int j : arr) {
            if (j > max)
                max = j;
        }

        for (int floor = max; floor >= 1; floor--){       // representing the size length of column(floor)
            for (int j : arr) {         // providing each value of array
                if (j >= floor) {
                    System.out.print("*\t");    // if i is more than floor there will be a star
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
