package Basics.Patterns;
import java.util.Scanner;
/*
    input -5
                    1
                2   3   2
            3   4   5   4   3
                2   3   2
                    1

 */
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int spaces = n/2;
        int star =1;
        int value= 1;

        for (int i = 1; i<=n; i++){
            for (int j =1; j<=spaces; j++){
                System.out.print("\t");
            }
            int cval = value;
            for (int j =1; j<=star; j++){
                System.out.print(cval+"\t");

                if (j <= star/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            System.out.println();

            if (i <=n/2){
                spaces--;
                star+=2;
                value++;
            }else{
                spaces++;
                star-=2;
                value--;
            }
        }

    }
}
