package in.co.Collection_List.Collection;

import java.util.Stack;

public class Stack_Pop {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Intial Stack:  "+ stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop operation: " + stack);

    }
}
