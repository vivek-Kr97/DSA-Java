package Basics.Numbers;
import java.util.*;


public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println(n + " is a negative number.");
        } else if (n > 0) {
            System.out.println(n + " is a Positive number.");
        } else {
            System.out.println(n + " is a not a negative or Positive number. Its Just Zero.0");
        }
    }
}
