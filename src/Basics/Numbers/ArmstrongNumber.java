package Basics.Numbers;

import java.util.Scanner;
//    A program to check a number is Armstrong or not??
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();


        int count = 0;
        int sum = 0;

//        counting digits
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

//        sum
        temp = num;
        while( temp >0){
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit,count);
            temp = temp/10;
        }

        if (num == sum){
            System.out.println(num+" is an Armstrong Number.");

        }else{
            System.out.println(num+" is not a Armstrong Number.");
        }




    }
}
