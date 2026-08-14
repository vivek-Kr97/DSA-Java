package Basics.Numbers;

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("The factors of "+ num + " are : ");
        for( int i = 1; i<=num; i++){
            if (num % i == 0){
                System.out.print("\t"+ i);
            }
        }
    }
}
