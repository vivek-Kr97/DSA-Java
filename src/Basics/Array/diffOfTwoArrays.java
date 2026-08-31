package Basics.Array;

import java.util.Scanner;

public class diffOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of smaller Array: ");
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        System.out.print("Enter the elements : ");
        for (int i = 0; i <= arr1.length-1; i++ ){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of bigger Array: ");
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        System.out.print("Enter the elements : ");
        for (int i = 0; i <= arr2.length-1; i++ ){
            arr2[i] = sc.nextInt();
        }
        int[] diff = new int[a];
        int c = 0;

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = diff.length-1;

        while (k>=0){
            int d ;
            int arr1v = i >= 0? arr1[i] : 0 ;


            if (arr2[j] >= arr1v){
                d = arr2[j] + c - arr1v;
                c = 0;
            }else {
                d = arr2[j] + c + 10 - arr1v;
                c = -1;
            }


            diff[k] = d;

            j--;
            k--;
            i--;
        }
        int idx = 0;
        while (idx < diff.length){
            if (diff[idx] == 0){
                idx++;
            }else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }
}
