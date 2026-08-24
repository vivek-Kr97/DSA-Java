package Basics.Methods;
import java.util.Scanner;
// Program to add two numbers from any base
public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the base : ");
        int base = sc.nextInt();
        int value = getSum(num1,num2,base);

        System.out.println("The sum is - "+ value);
    }
    public static int getSum(int num1, int num2, int base){
        int rv = 0;
        int carry = 0;
        int p = 1;
        while( num1 > 0 || num2 > 0 || carry > 0){
            int d1 = num1%10;
            int d2 = num2%10;
            num1 = num1 / 10;
            num2 = num2 /10;
            int d = d1 + d2 + carry;
            carry = d / base;
            d = d % base;
            rv +=d*p;
            p*=10;
        }
        return rv;
    }
}
