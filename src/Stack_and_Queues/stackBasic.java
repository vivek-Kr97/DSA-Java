package Stack_and_Queues;

import java.util.Stack;

/*
        In this program I'm going to learn about the stacks, how it is declared, used and its methods.

        How to declare a stack -
                Stack<Integer> variable_name  = new Stack<>();


            METHODS USED IN STACKS : -
        METHOD 01 :
            push() -> This method is used to add or push an element to the stackBasic.
        METHOD 02 :
            pop() -> This method is used to remove the last/ top element from the stack.
        METHOD 03 :
            peek() -> This method is used to view the topmost or last element of the stack
        METHOD 04 :
            size() -> returns the length of the stack.

 */
public class stackBasic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(78);
        st.push(68);
        System.out.println(st.peek() +"  "+ st.size());
        st.pop();
        System.out.println(st.peek() +"  "+ st.size());
        st.pop();
        System.out.println(st.size());
        st.push(100);
        System.out.println(st.peek() +"  "+ st.size());
    }
}
