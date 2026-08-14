package Basics.Numbers;

//A program to find the sum of digits in a Number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;
        int rem;

        while(num > 0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;

        }
        System.out.println("The sum of digit is :" + sum);
    }
}
