package Basics.Patterns;
import java.util.Scanner;
/*
    input - 5

            *
            *   *
    *   *   *   *   *
            *   *
            *

 */

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int spaces = n/2;
        int star = 1;

        for (int i = 1; i<=n; i++){
            for (int j =1; j<=spaces; j++){
                if (i == n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }

            }
            for (int j =1; j<= star; j++){
                System.out.print("*\t");
            }
            if (i<=n/2){
                star++;
            }else{
                star--;
            }
            System.out.println();
        }


    }
}
