package Basics.Array;
import java.util.Scanner;
/*    This program shows the sum of two arrays as an output.
        i.e. - arr1[1, 5, 3, 5, 6 ]
               arr2[4, 8, 6, 7, 5 ]
                ---------------------
            sum -  6   4   0   3   1

            [ Digits in the must be from 0-9]
 */

public class sumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st Array: ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.print("Enter the elements : ");
        for (int i = 0; i <= arr1.length-1; i++ ){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of 2nd Array: ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.print("Enter the elements : ");
        for (int i = 0; i <= arr2.length-1; i++ ){
            arr2[i] = sc.nextInt();
        }

        int[] dupl = new int[ a > b ? a : b];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = dupl.length-1;
        int carry = 0;

        while (k >= 0){
            int d  = carry;
            if (i >= 0){
                d+=arr1[i];
            }
            if (j >= 0){
                d+=arr2[j];
            }
            carry = d/10;
            d = d % 10;

            dupl[k] = d;
            i--;
            j--;
            k--;
        }
        if (carry!=0) System.out.print(carry);
        for (int v : dupl){
            System.out.print(v+"\t");
        }
    }
}
