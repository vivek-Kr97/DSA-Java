package Basics.Methods;
import java.util.Scanner;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the Base of this Number : ");
        int base = sc.nextInt();
        int value = getDecimal(n, base);
        System.out.println(value);
    }

    public static int getDecimal(int num, int base) {
        int rv = 0;
        int power = 1;
        while (num > 0) {
            int digit = num % 10;
            rv += digit*power;
            num = num/10;
            power= power * base;
        }
        return rv;
    }
}
