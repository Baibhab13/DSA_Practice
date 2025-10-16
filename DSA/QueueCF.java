import java.util.*;

public class QueueCF {
    public static void main(String args[]) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

/* Difference betweeen implementing queue using arraydeque and linkedlist

Features                            ArrayDeque          LinkedList
Underlying Structure                Resizable array     Doubly LinkedList
Performance (Add/Remove at Ends)    Generally faster    Constant time
Performance (Random Access)         Fast(O(1))          Slow(O(n))
Memory Efficiency                   More efficient      Less efficient(due to pointers)
Null Elements                       Not allowed         Allowed
Thread Safety                       Not thread-safe     Not thread-safe


 * when we use ArrayDeque and Linkedlist to implement queue in Java?
 * 
 * ArrayDeque is generally preferred for implementing queues -> when performance for adding and removing elements at the ends is critical, memory efficiency is a concern, and null elements are not required.

LinkedList might be considered -> if you need to store null elements, require frequent insertions or deletions in the middle of the list (though this is less common for pure queue implementations), or if random access is not a factor.
*/
