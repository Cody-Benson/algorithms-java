public class Solution {
    public int maxSumOfSubArray(int[] nums){

        int windowSize = 3;
        int maxSum = 0;

        for(int i=0;i<=nums.length - windowSize;i++){
            int counter = 0;
            int curSum = 0;
            while(counter < windowSize){
                curSum += nums[i+counter];
                counter++;
            }
            maxSum = (curSum > maxSum) ? curSum : maxSum;
        }
        
        return maxSum;
    }
}
