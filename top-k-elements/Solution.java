import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
public class Solution {
    public Solution(){};
    public void topKElements(ArrayList<Integer> nums){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer num : nums){
            maxHeap.add(num);
        }

        int largest = maxHeap.poll();
        int secondLargest = maxHeap.poll();
        int thirdLargest = maxHeap.poll();

        System.out.printf("the largest number is %d, the second largest is %d, and the third largest is %d",largest,secondLargest,thirdLargest);
    }

    public void bottomKElements(ArrayList<Integer> nums){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(Integer num : nums){
            maxHeap.add(num);
        }

        int largest = maxHeap.poll();
        int secondLargest = maxHeap.poll();
        int thirdLargest = maxHeap.poll();

        System.out.printf("the largest number is %d, the second largest is %d, and the third largest is %d",largest,secondLargest,thirdLargest);
    }
}