
public class LinkedListOperations {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println(data + " removed.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println(data + " not found in the list.");
        } else {
            current.next = current.next.next;
            System.out.println(data + " removed.");
        }
    }


    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data)
                return true;
            current = current.next;
        }
        return false;
    }


    public void update(int oldData, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == oldData) {
                current.data = newData;
                System.out.println(oldData + " updated to " + newData);
                return;
            }
            current = current.next;
        }
        System.out.println(oldData + " not found in the list.");
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();


        list.add(10);
        list.add(20);
        list.add(30);
        list.display();

        System.out.println("Search 20: " + list.search(20));
        System.out.println("Search 40: " + list.search(40));

        list.update(20, 25);
        list.display();

        list.remove(10);
        list.display();


        list.remove(100);
        list.display();
    }
}
