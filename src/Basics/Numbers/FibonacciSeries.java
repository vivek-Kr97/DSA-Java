package Basics.Numbers;

import java.util.Scanner;
//    THIS PROGRAM ACCEPTS A VALUE AND PRINTS THE 'N' NNUMBER OF FIBONACCI SERIES

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of Fibonacci series: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i<num; i++){
            System.out.println(a +"\t");
            int c = a+b;
            a = b;
            b = c;
        }


    }
}

