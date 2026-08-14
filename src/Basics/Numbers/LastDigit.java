package Basics.Numbers;

//A Program to find the last digit of a Number

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        System.out.println("The last digit of this Number is : " +Math.abs(lastDigit));

    }
}
