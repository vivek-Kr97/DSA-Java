package Basics.Numbers;

import java.util.Scanner;

//    A program to find the Smallest digit in a Number
public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int smallest = 9;
        while( num > 0){
            int digit = num%10;

            if (digit < smallest){
                smallest = digit;
            }
            num = num/10;
        }
        System.out.println("The smallest digit is : "+ smallest);
    }
}
