package algorithms;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int slow = 0;
        int fast = numbers.length - 1;
        int sum = numbers[slow] + numbers[fast];
        while(sum != target){
            if(sum < target) slow++;
            else fast--;
            sum = numbers[slow] + numbers[fast];
        }
        return new int []{slow + 1, fast + 1};
    }
}
