package in.co.Collection_List.Collection;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer > stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());

        }
    }
}
