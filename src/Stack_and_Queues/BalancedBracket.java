package Stack_and_Queues;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your expression: ");
        String str = sc.nextLine();

        Stack<Character> stk = new Stack<>();
        boolean balanced = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else if (ch == ')') {
                if (!handleClosing(stk, '(')) { balanced = false; break; }
            } else if (ch == '}') {
                if (!handleClosing(stk, '{')) { balanced = false; break; }
            } else if (ch == ']') {
                if (!handleClosing(stk, '[')) { balanced = false; break; }
            }
        }

        if (balanced && stk.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }

    public static boolean handleClosing(Stack<Character> stk, char openingChar) {
        if (stk.isEmpty()) {
            return false;
        } else if (stk.peek() != openingChar) {
            return false;
        } else {
            stk.pop();
            return true;
        }
    }
}