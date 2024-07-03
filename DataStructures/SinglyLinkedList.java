import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int num) {
        this.data = num;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head = null;

    void display() {
        System.out.println("Displaying all the elements: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void insertAtBegin(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertAtEnd(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void insertAtMidAfter(int num, int after) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.data != after) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void insertAtMidBefore(int num, int before) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next.data != before) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    void deleteAtMid(int num) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next.data != num) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    void deleteRange(int start, int end) {
        Node temp = head;
        Node temp1 = head;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        if (count < end) {
            System.out.println("Invalid range");
            return;
        } else {
            count = 1;
            temp = head;
            while (count < start - 1) {
                temp = temp.next;
                count++;
            }
            count = 1;
            while (count < end) {
                temp1 = temp1.next;
                count++;
            }
            temp.next = temp1.next;
        }
    }

    void search(int num) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            int pos = 0;
            while (temp != null) {
                pos++;
                temp = temp.next;
            }
            System.out.println("Element found at position " + pos);
        }
    }

    void findLength() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int count = 1;
        Node temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("The length of the list is " + count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SinglyLinkedList ll = new SinglyLinkedList();

        int iterator = 1;

        do {
            System.out.println("------------------------------------------------------------------------");
            System.out.println(
                    "Singly Linked List implementation:\n1. Display\n2. Insertion\n3. Deletion\n4. Search\n5. Length\n6. Exit");
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            int num, after, before, start, end;

            switch (choice) {
                case 1:
                    ll.display();
                    break;
                case 2:
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println(
                            "1. Insert at beginning\n2. Insert at end\n3. Insert at middle after an element\n4. Insert at middle before an element");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.print("Enter your choice: ");
                    int insChoice = sc.nextInt();
                    switch (insChoice) {
                        case 1:
                            System.out.print("Enter a number to insert: ");
                            num = sc.nextInt();
                            ll.insertAtBegin(num);
                            ll.display();
                            break;
                        case 2:
                            System.out.print("Enter a number to insert: ");
                            num = sc.nextInt();
                            ll.insertAtEnd(num);
                            ll.display();
                            break;
                        case 3:
                            System.out.print("Enter a number to insert: ");
                            num = sc.nextInt();
                            System.out.print("Enter the element after which you want to insert: ");
                            after = sc.nextInt();
                            ll.insertAtMidAfter(num, after);
                            ll.display();
                            break;
                        case 4:
                            System.out.print("Enter a number to insert: ");
                            num = sc.nextInt();
                            System.out.print("Enter the element before which you want to insert: ");
                            before = sc.nextInt();
                            ll.insertAtMidBefore(num, before);
                            ll.display();
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println(
                            "1. Delete at beginning\n2. Delete at end\n3. Delete at middle\n4. Delete range of numbers");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.print("Enter your choice: ");
                    int delChoice = sc.nextInt();
                    switch (delChoice) {
                        case 1:
                            ll.deleteAtBegin();
                            ll.display();
                            break;
                        case 2:
                            ll.deleteAtEnd();
                            ll.display();
                            break;
                        case 3:
                            System.out.print("Enter a number to delete: ");
                            num = sc.nextInt();
                            ll.deleteAtMid(num);
                            ll.display();
                            break;
                        case 4:
                            System.out.print("Enter start position of the range: ");
                            start = sc.nextInt();
                            System.out.print("Enter end position of the range: ");
                            end = sc.nextInt();
                            ll.deleteRange(start, end);
                            ll.display();
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Enter the number to search: ");
                    num = sc.nextInt();
                    ll.search(num);
                    break;
                case 5:
                    ll.display();
                    ll.findLength();
                    break;
                case 6:
                    System.out.println("Poitu vanga tata");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("------------------------------------------------------------------------");
            System.out.print("Enter 1 to continue or 0 to exit: ");
            iterator = sc.nextInt();

        } while (iterator != 0);
        sc.close();
    }
}
