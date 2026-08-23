package Basics.Patterns;

import java.util.Scanner;

//    input any number & print its table
public class Pattern13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.print(n + " * "+ i + " = " + n*i);
            System.out.println();
        }

    }
}
