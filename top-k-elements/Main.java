import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(24);
        nums.add(56);
        nums.add(12);

        solution.topKElements(nums);
        solution.bottomKElements(nums);
    }
}