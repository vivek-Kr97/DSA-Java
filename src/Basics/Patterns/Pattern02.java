package Basics.Patterns;

import java.util.Scanner;

/*
    Input - 5
                    *
                *   *
            *   *   *
        *   *   *   *
    *   *   *   *   *

 */
public class Pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n = sc.nextInt();
        int sp = n-1;
        int st = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <sp; j++){
                System.out.print("\t");
            }
            for (int j = 0; j <st; j++){
                System.out.print("*\t");
            }
            System.out.println();
            sp--;
            st++;
        }

    }
}
