public class Main {
    public static void main(String[] args){
        
        Solution solution = new Solution();
        int[] nums = {1,34,5,7,8,5};
        
        int maxSum = solution.maxSumOfSubArray(nums);
        System.out.println(maxSum);
    }
}
