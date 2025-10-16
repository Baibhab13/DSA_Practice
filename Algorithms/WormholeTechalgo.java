// WORMHOLE TELEPORTATION ALGORITHM

// This logic brought me to the optimal solution. As you can see you like "Jump" from bracket to bracket with changing the direction. 
// If you ever found ( and jumped to ) it matching you'll always return to this ( and then jump one more time to ) but with another direction which means you escape from this pair of brackets.

import java.util.*;

public class WormholeTechalgo {
    public static String reverseParentheses(String s) {
        int n = s.length();
        int[] index_pairs = new int[n];
        Deque<Integer> stack_start_ind = new LinkedList<>();

        for (int char_ind = 0; char_ind < n; ++char_ind) {
            char char_s = s.charAt(char_ind);
            if (char_s == '(') {
                stack_start_ind.push(char_ind);
            } else if (char_s == ')') {
                int start_ind = stack_start_ind.pop();
                index_pairs[char_ind] = start_ind;
                index_pairs[start_ind] = char_ind;
            }
        }

        StringBuilder res = new StringBuilder();
        int cur_ind = 0;
        int cur_dir = 1;

        while (cur_ind < n) {
            char char_s = s.charAt(cur_ind);
            if (char_s == '(' || char_s == ')') {
                cur_ind = index_pairs[cur_ind];
                cur_dir *= -1;
            } else {
                res.append(char_s);
            }
            cur_ind += cur_dir;
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String s="(ed(et(oc))el)";
        String ans=reverseParentheses(s);
        System.out.println(ans);
    }
}
