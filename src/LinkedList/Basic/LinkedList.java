public class LinkedList {

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            //this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;
    // Insert at start
    public static void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {          // empty list
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Insert at end
    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {          // empty list
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // Display
    public static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        insertAtStart(20);
        insertAtStart(10);
        insertAtEnd(30);
        insertAtEnd(40);
        display();   // Output: 10 -> 20 -> 30 -> 40 -> null
    }
}