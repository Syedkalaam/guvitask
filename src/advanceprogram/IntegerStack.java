package advanceprogram;

import java.util.Stack;

public class IntegerStack {

    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    public void pushElement(int value) {
        stack.push(value);
        System.out.println("Pushed " + value + " onto the stack.");
    }

    public void popElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
        } else {
            int poppedValue = stack.pop();
            System.out.println("Popped " + poppedValue + " from the stack.");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Current stack: " + stack);
        }
    }

    public static void main(String[] args) {
        IntegerStack integerStack = new IntegerStack();

        integerStack.pushElement(10);
        integerStack.pushElement(20);
        integerStack.pushElement(30);
        integerStack.displayStack();
        integerStack.popElement();
        integerStack.displayStack();

        if (integerStack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty.");
        }

        integerStack.popElement();
        integerStack.popElement();

        if (integerStack.isEmpty()) {
            System.out.println("The stack is empty.");
        }
    }
}



