package algorithms;

import java.util.Arrays;

public class SquareOfSortedArrays {
    //TODO 977. Squares of a Sorted Array
    public int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = nums[i]*nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}
