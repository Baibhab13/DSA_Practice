//  

public class stack {
//     IMPLEMENTATION OF
//     STACK USING ARRAYLIST

    // static class Stack {
    //     static ArrayList<Integer> list = new ArrayList<Integer>();

    //     public boolean isEmpty() {
    //         return list.size() == 0;
    //     }

    //     public void push(int data) {
    //         list.add(data);
    //     }

    //     public int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }

    //     public int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }

    //         return list.get(list.size() - 1);
    //     }
    // }

//     IMPLEMENTATION OF
//     STACK IN LINKEDLIST

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class Stack {
        public static Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            // setting the address as the head
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

//IMPLEMENTATION OF STACK USING COLLECTION FRAMEWORKS
// import java.util.*;


// public class stack {
//     public static void pushAtBottom(int data, Stack<Integer> s) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(data, s);
        
//         s.push(top);
//     }
    
//     public static void reverse(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }
//         int top =s.pop();
//         reverse(s);
//         pushAtBottom(top,s);
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<Integer>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         reverse(s);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }