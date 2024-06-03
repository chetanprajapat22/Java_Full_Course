package in.co.Collection_List.Collection;

import java.util.Stack;

public class Stack_Addition {
    public static void main(String[] args) {
        Stack stack1 = new Stack();

        Stack<String > stack2 = new Stack<String>();

        stack1.push("4");
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("for");
        stack2.push("Geeks");

        Stack<Integer> n = new Stack<Integer>();

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        stack2.push("50");
        stack2.push("60");
        System.out.println(stack1);
        System.out.println(stack2);
    }
}
