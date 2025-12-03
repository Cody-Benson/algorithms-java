import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Solution s = new Solution();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);


        int sum = s.calculateTheTotalSum(nums);
        System.out.println("total without prefix is: " + sum);

        sum = s.calculatePrefixSum(nums);
        System.out.println("the total prefix sum is:" + sum);


        nums.clear();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        int left = 1;
        int right = 3;
        sum = s.calculatePrefixSumBetween(nums, left, right);
        System.out.println("the sum between " + left + " and " + right + " is:" + sum);
    }
}