//USING COLLECTION FRAMEWORK

// import java.util.*;

// class LL {
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<String>();

//         list.addFirst("a");
//         list.addFirst("is");
//         list.addFirst("This");
//         list.addLast("linkedlist");
//         list.size();
//         System.out.println(list);
//         System.out.println(list.size());

//         for(int i=0;i<list.size();i++) {
//             System.out.print(list.get(i)+ " -> ");
//         }
//         System.out.print("null");
//     }
// }

// USING LINKEDLIST FROM SCRATCH

public class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    // creating of the node
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
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
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        // head.next = null -> lastNode = null
        Node lastNode = head.next;
        // null.next
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void printList() {
        if (head == null) {
            System.out.println("The list is empty..");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    public int getSize() {
        return size;
    }

    // recursive approach
    public Node reverseReccrusive(Node head) {

        // base condition
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseReccrusive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // iterative approach
    public void reverseIterate() {
        // base condition
        // if there is only one node
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.addLast("linkedlist");
        list.printList();
        System.out.println(list.getSize());

        list.deleteFirst();
        list.printList();
        System.out.println(list.getSize());

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

        list.reverseIterate();
        list.printList();

        list.head = list.reverseReccrusive(list.head);
        list.printList();
    }
}