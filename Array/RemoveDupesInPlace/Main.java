public class Main{
    public static void main(String[] args){
        //remove duplicates from sorted array
        int[] nums = {1,2,3};

        int unique = removeDupes(nums);
        System.out.printf("number of unique numbers is %d%n",unique);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static int removeDupes(int[] nums){
        int writeIndex = 1;
        for(int readIndex =1;readIndex<nums.length;readIndex++){
            if(nums[readIndex] != nums[writeIndex-1]){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return writeIndex;
    }
}