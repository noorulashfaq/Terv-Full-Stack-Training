import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int num) {
        this.data = num;
        this.next = null;
    }

}

class Stack {

    Node top;

    Stack(int size) {
        this.top = null;
    }

    void display() {
        Node temp = top;
        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void push(int x) {
        Node newNode = new Node(x);
        // if (isFull()) {
        // System.out.println("Stack Overflow");
        // } else {
        newNode.next = top;
        top = newNode;
        // }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
        } else {
            int x = top.data;
            top = top.next;
            System.out.println("The popped data is " + x);
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    int peek() {
        if (isEmpty())
            System.out.println("Stack Underflow");
        return top.data;
    }

}

public class StackOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack st = new Stack(size);

        int iterator = 1;

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println(
                    "Stack implementation using Linked list:\n1. Push\n2. Pop\n3. Peek\n4. Check isEmpty");
            System.out.println("-----------------------------------------------------");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data to push: ");
                    int num = sc.nextInt();
                    st.push(num);
                    st.display();
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    System.out.println("The peek element is " + st.peek());
                    break;

                case 4:
                    if (st.isEmpty())
                        System.out.println("Empty");
                    else
                        System.out.println("Not empty");

                default:
                    break;
            }

            System.out.print("Enter 1 to continue or 0 to exit: ");
            iterator = sc.nextInt();

        } while (iterator != 0);
        sc.close();

    }
}