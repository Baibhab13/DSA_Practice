import java.util.HashSet;
import java.util.Iterator;

public class hasshSett {
    public static void main(String[] args) {
        // Example usage of HashSet
        HashSet<Integer> set = new HashSet<>();
        
        // Adding elements to the HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        
        System.out.println("HashSet: " + set);
        // Displaying the HashSet
        System.out.println("HashSet: " + set.size());
        
        // Checking if an element exists
        if (set.contains(1)) {
            System.out.println("Contains in the HashSet.");
        } else {
            System.out.println("Does not contain in the HashSet.");
        }
        
        // Removing an element
        set.remove(2);
        System.out.println("After removing 2: " + set);

        Iterator<Integer> it = set.iterator();
        System.out.println("Iterating through the HashSet:");

        //hasNext() and next() methods
        /*  
         * hasNext() checks if there are more elements in the iterator.
         * when it returns true, it means there is at least one more element to iterate over.
         * 
         * 
         * next() returns the next element in the iteration.
         * 
         * at first the iterator points to the first element,
         * so when it.next() is called, it returns the first element.
         * After that, it moves to the next element and son on.
         * 
         */

        while (it.hasNext()) { 
            System.out.println(it.next());
        }
    }
}

