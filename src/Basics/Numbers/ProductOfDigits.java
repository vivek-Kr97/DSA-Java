package Basics.Numbers;

import java.util.Scanner;

//  A program to find the product of digits from a Number

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int digit;
        int product = 1;

        while (num >= 1) {
            digit = num % 10;
            product = product * digit;
            num = num / 10;

        }
        System.out.println("The product of digit is : " + product );

    }
}
