package Basics.Numbers;

import java.util.Scanner;

//A program to check the number is Even or Odd.
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Natural Number : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is an Even Number.");
        }else {
            System.out.println(num + " is a Odd Number.");
        }
    }
}
