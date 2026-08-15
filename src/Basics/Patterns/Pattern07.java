package Basics.Patterns;

import java.util.Scanner;
/*
input - 5
                *
            *
        *
    *
*

 */
public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sp = n-1;

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<= sp; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
            sp--;
        }
    }
}
