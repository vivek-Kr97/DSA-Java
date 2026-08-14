package Basics.Numbers;

import java.util.Scanner;
//  A program to find the largest digit in a Number

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int largest = 0;
        while( num > 0){
            int digit = num%10;

            if (digit>largest){
                largest = digit;
            }
            num = num/10;
        }
        System.out.println("The largest digit is : "+ largest);
    }
}
