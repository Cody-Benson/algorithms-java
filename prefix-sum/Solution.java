import java.util.ArrayList;

public class Solution {
    public Solution(){}
    
    public int calculateTheTotalSum(ArrayList<Integer> nums){
        int total = 0;
        for(int number : nums){
            total += number;
        }
        return total;
    }

    public int calculatePrefixSum(ArrayList<Integer> nums){
        for(int i=1;i<nums.size();i++){
            int prev = nums.get(i-1);
            int curSum = prev + nums.get(i);
            nums.set(i,curSum);
        }
        return nums.get(nums.size()-1);
    }

    public int calculatePrefixSumBetween(ArrayList<Integer> nums, int left, int right){
        for(int i=1;i<nums.size();i++){
            int prev = nums.get(i-1);
            int curSum = prev + nums.get(i);

            nums.set(i, curSum);
        }

        for(int n:nums){
            System.out.println(n);
        }
        return nums.get(right) - nums.get(left);
    }
}