// KADANE'S ALGORITHM

// Kadane's algorithm is a dynamic programming technique used to find the meximum subarray um inn an array of number.
// The algorithm maintains two variables:
// 1. max_current -> represetn the maximum sum ending at the current position
// 2. max_global -> represents the maximum subarray sum encountered so far
// At each iteration, it updates max_current to include the current element or start a new subarray if the current element is larger than accumulated.
// The max_global is updated if max_current surpassed the value

//In the provided approach for finding the maximum profit in stock price, the algorithm can be seen as  variation of kadane's algorithm.
// Instead of finding the maximum subarray sum directly, it focuses on finding the maximum the array difference between consecutive element in array. 

public class kadanesalgorithm {
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++) {
            if(prices[i]<buy) {
                buy=prices[i];
            } else if(prices[i]-buy>profit) {
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);
    }
}
