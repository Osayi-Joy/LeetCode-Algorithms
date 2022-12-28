package algorithms;

import java.util.Arrays;

public class BinarySearch {
    //TODO 704. Binary Search
    public int search(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        if(result < 0) return -1;
        return result;
    }
}
