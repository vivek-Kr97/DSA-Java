package Basics.Patterns;

import java.util.Scanner;

/*
input - 5
*   *   *   *   *
    *   *   *   *
        *   *   *
            *   *
                *
 */
public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        int sp = 0;
        int st = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j < st; j++) {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }

    }
}
