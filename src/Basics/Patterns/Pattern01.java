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
public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int st = sc.nextInt();

        for (int i = 0; i <= st; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
