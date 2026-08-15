package Basics.Patterns;
import java.util.Scanner;
/*
input - 5
        *
    *       *
*               *
    *       *
        *
 sp st  is
2   1   -1  1
1   1   1   1
0   1   3   1
1   1   1   1
2   1   -1  1
 */

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int outerSpace = n/2;
        int innerSpace = -1;

        for (int i =1; i<= n; i++){
            for (int j =1; j<=outerSpace; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j =1; j<=innerSpace; j++){
                System.out.print("\t");
            }
            if (i > 1 && i<n){
                System.out.print("*\t");
            }
            if (i <= n/2){
                outerSpace--;
                innerSpace+=2;
            }else {
                outerSpace++;
                innerSpace-=2;
            }
            System.out.println();
        }

    }
}
