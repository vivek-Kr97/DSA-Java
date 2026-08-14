package Basics.Numbers;

import java.util.Scanner;

//A Program to find the first digit of a Number.

public class FirstDigit {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a Number : ");
            int num = sc.nextInt();

            while (num >= 10) {
                num = num / 10;
            }
            System.out.println("The First digit is : " + Math.abs(num));

    }
}