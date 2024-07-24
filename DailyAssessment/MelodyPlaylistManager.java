import java.util.Scanner;

public class MelodyPlaylistManager {
    public static class Node {
        String data;
        Node next;

        Node(String song) {
            this.data = song;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head = null;

        void insert(String song) {
            // System.out.print(song + " ");
            Node newNode = new Node(song);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        void insertAtFirst(String song) {
            Node newNode = new Node(song);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        void insertAtLast(String song) {
            Node newNode = new Node(song);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        void insertAtPos(int pos, String song) {
            Node newNode = new Node(song);
            int count = 0;
            Node temp = head;
            while (count != pos - 1) {
                count++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        void delAtFirst() {
            head = head.next;
        }

        void delAtLast() {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                if (temp.next != null) {
                    System.out.print(temp.data + " -> ");
                } else {
                    System.out.print(temp.data);
                }
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l = new LinkedList();
        String song;
        while (true) {
            song = sc.nextLine();
            if (song.length() == 0)
                break;
            l.insert(song);
        }
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            String choice = sc.nextLine();
            switch (choice) {
                case "Precede":
                    song = sc.nextLine();
                    l.insertAtFirst(song);
                    break;
                case "Follow":
                    song = sc.nextLine();
                    l.insertAtLast(song);
                    break;
                case "ExtractFirst":
                    l.delAtFirst();
                    break;
                case "ExtractLast":
                    l.delAtLast();
                    break;
                case "EmbedAt":
                    int pos = Integer.parseInt(sc.nextLine());
                    song = sc.nextLine();
                    l.insertAtPos(pos, song);
                    break;
            }
            t--;
        }
        l.display();
    }
}