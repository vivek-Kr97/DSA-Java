package Basics.Patterns;
import java.util.Scanner;
/*
input - 5
    1                       1
    1   2               2   1
    1   2   3       3   2   1
    1   2   3   4   3   2   1

 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int star = 1;

        int spaces = 2*n-3;
        for (int i = 1; i <= n; i++){
            int val = 1;
            for (int j =1; j<= star; j++){
                System.out.print(val+"\t");
                val++;
            }
            for (int j =1; j<= spaces; j++){
                System.out.print("\t");
            }
            if (i==n){
                star--;
                val--;
            }
            for (int j =1; j<= star; j++){
                val--;
                System.out.print(val+"\t");
            }
                spaces-=2;
                star++;

                System.out.println();

        }
    }
}
