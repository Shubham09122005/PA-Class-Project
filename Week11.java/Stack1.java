public class Stack1 {

    static class Stack {
        int[] stack;
        int top;
        int capacity;

        Stack(int size) {
            capacity = size;
            stack = new int[capacity];
            top = -1;
        }

        void push(int value) {
            if (top == stack.length - 1) {
                System.out.println("Stack Overflow");
                return;
            }

            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }

            return stack[top--];
        }

        int peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return -1;
            }

            return stack[top];
        }

        void display() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }

            System.out.print("Stack: ");

            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack(5);

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        // Display after pushing
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Popped: " + s.pop());
        s.display();

        System.out.println("Top element: " + s.peek());
    }
}