public class Solution {
    public int findMiddleValue(int[] nums){
        int fast = 0;
        int mid = 0;
        for(int i=0;fast<nums.length;i++){
            fast += 2;
            mid = nums[i];
        }
        return mid;
    }
}
