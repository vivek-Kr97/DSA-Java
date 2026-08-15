package Basics.Patterns;
import java.util.Scanner;
/*
input - 5

*               *
    *       *
        *
    *       *
*               *

 */

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

}
