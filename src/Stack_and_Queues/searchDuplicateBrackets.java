package Stack_and_Queues;

import java.util.Scanner;
import java.util.Stack;

public class searchDuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ( ch == ')' ){
                if ( stk.peek() == '(' ){
                    System.out.print("duplicate");
                    return;
                }
                else {
                    while ( stk.peek() != '(' ){
                        stk.pop();
                    }
                    stk.pop();
                }
            }else {
                stk.push(ch);
            }
        }
        System.out.print(false);
    }
}
