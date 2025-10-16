// When there is a majority element present(which means a elements that appears more than n/2 times where n is the length of the appears.
// then the number of vote that candidate gets is always more than the rest other candidates.

// MAJORITY ELEMENT

/*
 */

public class MooresVoteAlgorithm {
    public static int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int num: nums) {

            //setting the candidate 
            if(count==0) {
                candidate = num;
            }
            // Counting the vote number for the candidate;
            if(num ==candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}