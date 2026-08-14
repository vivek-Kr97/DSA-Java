package Basics.Numbers;

import java.util.Scanner;
//    A program to check whether it is palindrome or not ?

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int temp = num;
        int newNum = 0;
        int digit;

        while (num > 0) {
            digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }

        if (newNum == temp){
            System.out.println(temp+" is a palindrome number.");
        }else{
            System.out.println(temp+" is not a palindrome number.");
        }
    }
}
