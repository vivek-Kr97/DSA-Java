package Basics.Patterns;
import java.util.Scanner;
/*
input - 5 (Pyramid of fibonacci series)
    0
    1   1
    2   3   5
    8   13  21  34
    55  89  144 233 377

 */

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 1; i<= n; i++){
            for (int j =1; j<=i; j++){
                System.out.print(a+"\t");
                int c = a+b;
                a=b;
                b=c;
            }

            System.out.println();
        }

    }
}
