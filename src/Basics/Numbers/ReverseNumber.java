package Basics.Numbers;

import java.util.Scanner;

//    A program to reverse the digts of a number

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int newNum = 0;
        int digit;

        while(num>0){
            digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num/10;
        }
        System.out.println(newNum);
    }
}
