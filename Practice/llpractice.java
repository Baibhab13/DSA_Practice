package Practice;
import java.util.*;

public class llpractice {
    Node head;

    // creation of the node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // adding node at the first
    public void addFirst(int data) {
        Node newNode = new Node(data);

        // check if list is empty or not
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // adding node at the last
    public void addLast(int data) {
        Node newNode = new Node(data);

        // check if list is empty or not
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        // traversing to the end of the list
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }

        // set the head to the next node
        head = head.next;
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }

        // If only one node is present
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        // traversing to the 2nd last node of the list
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        // after deleting setting the nodes.next to NULL
        secondLast.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.print("The list is empty");
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        llpractice list = new llpractice();
        list.addFirst(2);
        list.addFirst(1);
        list.printList();

        list.deletelast();
        list.printList();

        LinkedList<Integer> a = new LinkedList<>();
        a.addFirst(2);
        a.addFirst(1);
        a.addFirst(0);

        System.out.println(a);
        System.err.println(a.size());
    }

}