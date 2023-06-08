
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    int detectLoop() {
        if (head == null || head.next == null) {
            return 0; // No loop
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                if (slow == head) {
                    return 2; // Circular list
                } else {
                    return 1; // Loop
                }
            }
        }

        return 0; // No loop
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Create a linked list with a loop
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(9);
        list.addNode(5);
        list.addNode(7);
        list.addNode(5);

        list.addNode(1);


        list.head.next.next.next.next.next = list.head.next; // Creating a loop

        int result = list.detectLoop();
        if (result == 0) {
            System.out.println("No loop found");
        } else if (result == 1) {
            System.out.println("Loop found");
        } else if (result == 2) {
            System.out.println("Circular list found");
        }
    }
}
