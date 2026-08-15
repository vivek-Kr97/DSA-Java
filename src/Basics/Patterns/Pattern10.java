package Basics.Patterns;
import java.util.Scanner;
/*
input - 5
    1
    2   3
    4   5   6
    7   8   9   10
    11  12  13  14  15

 */
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
}
