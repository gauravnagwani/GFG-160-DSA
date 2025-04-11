class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
        int total =0;
        int maxSum = arr[0];
        int minSum = arr[0];
        int currMax = 0;
        int currMin = 0;
        for(int num : arr){
            currMax = Math.max(num , currMax+num);
            maxSum = Math.max(currMax, maxSum);
            
            currMin = Math.min(num , currMin+num);
            minSum = Math.min( minSum , currMin);
            
            total+=num;
        }
    return (maxSum>0) ? Math.max(maxSum , total-minSum) : maxSum;
    }
}