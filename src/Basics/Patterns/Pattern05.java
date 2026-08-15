package Basics.Patterns;
/*
input - 5

*   *   *       *   *   *
*   *               *   *
*                       *
*   *               *   *
*   *   *       *   *   *

 */

import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int star = n/2 + 1;
        int spaces = 1;

        for (int i = 1; i <=n; i++){
            for (int j = 1; j<=star; j++){
                System.out.print("*\t");
            }
            for (int j = 1; j<= spaces; j++){
                System.out.print("\t");
            }
            for (int j = 1; j<=star; j++){
                System.out.print("*\t");
            }
            if ( i <= n/2){
                star--;
                spaces+=2;
            }else{
                star++;
                spaces-=2;
            }
            System.out.println();

        }

    }
}
