package Basics.Methods;

import java.util.Scanner;

public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the Base of this Number : ");
        int base1 = sc.nextInt();
        System.out.print("Enter the Base you want to convert into  : ");
        int base2 = sc.nextInt();
        int value = getValue(n,base1,base2);
        System.out.println(value);

    }
    public static int getValue(int n, int base1, int base2){
        int decimal = getDecimal(n, base1);
        int dn = getValueInBase(decimal ,base2);
        return dn;
    }

    public static int getValueInBase(int num, int base) {
        int rv = 0;
        int power = 1;
        while ( num > 0){
            int dig = num % base;
            num = num / base;

            rv += dig * power;
            power *= 10;
        }
        return rv;
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
