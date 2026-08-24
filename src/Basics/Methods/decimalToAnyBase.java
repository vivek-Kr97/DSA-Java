package Basics.Methods;
import java.util.Scanner;

//    This program converts decimal number system to any other number system using JAVA methods .

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        System.out.print("Enter the base you want to convert into : ");
        int base = sc.nextInt();
        int dn = getValueInBase(num,base);
        int decimal = num;
        System.out.println("The number " + decimal + " in decimal is " +dn + " in base " + base+".");
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
}
