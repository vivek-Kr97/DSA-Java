package Basics.Numbers;

import java.util.Scanner;

//A program to find the no. of digits in a Number.

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        Long num = sc.nextLong();
        Long temp = num;
        byte count = 0;

        while(num >= 1){
            num = num/10;
            count++;
        }
        System.out.println("There are "+ count +" Digits in "+ temp);
    }
}
