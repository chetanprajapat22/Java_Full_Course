package in.co.Collection_List.Collection;

import java.util.Stack;

public class Stack_Peek {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("welcome ");
        stack.push("to  ");
        stack.push("the  ");
        stack.push("World ");
        stack.push(" Guys ");
        System.out.println("Initial Stack: " + stack);
        System.out.println("the element at the top of the " + "stack is: " + stack.peek());
        System.out.println("the final stack: " + stack);

    }
}
