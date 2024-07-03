import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int num) {
        this.data = num;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {

    Node head = null;

    void displayHeadToTail() {
        System.out.println("Displaying all the elements: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void displayTailToHead() {
        System.out.println("Displaying all the elements: ");
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    void insertAtBegin(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
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
            newNode.prev = temp;
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
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
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
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            head.prev = null;
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
            temp.next.prev = null;
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
            temp.next.prev = temp;
        }
    }

    // void deleteRange(int start, int end) {
    // Node temp = head;
    // Node temp1 = head;
    // int count = 1;
    // while (temp.next != null) {
    // count++;
    // temp = temp.next;
    // }
    // if (count < end) {
    // System.out.println("Invalid range");
    // return;
    // } else {
    // count = 1;
    // temp = head;
    // while (count < start - 1) {
    // temp = temp.next;
    // count++;
    // }
    // count = 1;
    // while (count < end) {
    // temp1 = temp1.next;
    // count++;
    // }
    // temp.next = temp1.next;
    // }
    // }

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
        DoublyLinkedList ll = new DoublyLinkedList();

        int iterator = 1;

        do {
            System.out.println("------------------------------------------------------------------------");
            System.out.println(
                    "Doubly Linked List implementation:\n1. Display\n2. Insertion\n3. Deletion\n4. Search\n5. Length\n6. Exit");
            System.out.println("------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            int num, after, before, start, end;

            switch (choice) {
                case 1:
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("1. Head to tail\n2. Tail to head");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.print("Enter your choice: ");
                    int disChoice = sc.nextInt();
                    switch (disChoice) {
                        case 1:
                            ll.displayHeadToTail();
                            break;
                        case 2:
                            ll.displayTailToHead();
                            break;
                    }
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
                            ll.displayHeadToTail();
                            break;
                        case 2:
                            System.out.print("Enter a number to insert: ");
                            num = sc.nextInt();
                            ll.insertAtEnd(num);
                            ll.displayHeadToTail();
                            break;
                        case 3:
                            System.out.print("Enter a number to insert: ");
                            num = sc.nextInt();
                            System.out.print("Enter the element after which you want to insert: ");
                            after = sc.nextInt();
                            ll.insertAtMidAfter(num, after);
                            ll.displayHeadToTail();
                            break;
                        case 4:
                            System.out.print("Enter a number to insert: ");
                            num = sc.nextInt();
                            System.out.print("Enter the element before which you want to insert: ");
                            before = sc.nextInt();
                            ll.insertAtMidBefore(num, before);
                            ll.displayHeadToTail();
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println(
                            "1. Delete at beginning\n2. Delete at end\n3. Delete at middle");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.print("Enter your choice: ");
                    int delChoice = sc.nextInt();
                    switch (delChoice) {
                        case 1:
                            ll.deleteAtBegin();
                            ll.displayHeadToTail();
                            break;
                        case 2:
                            ll.deleteAtEnd();
                            ll.displayHeadToTail();
                            break;
                        case 3:
                            System.out.print("Enter a number to delete: ");
                            num = sc.nextInt();
                            ll.deleteAtMid(num);
                            ll.displayHeadToTail();
                            break;
                        // case 4:
                        // System.out.print("Enter start position of the range: ");
                        // start = sc.nextInt();
                        // System.out.print("Enter end position of the range: ");
                        // end = sc.nextInt();
                        // ll.deleteRange(start, end);
                        // ll.display();
                        // break;
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
                    // ll.display();
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
