package algorithms;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchInsertPosition {
    //TODO 35. Search Insert Position
    public int searchInsert(int[] nums, int target) {
        Set<Integer> mySet = IntStream.of(nums).boxed().collect(Collectors.toSet());
        mySet.add(target);
        Integer[] array = mySet.stream().toArray(Integer[]::new);
        Arrays.sort(array);
        return Arrays.binarySearch(array, target);
    }
}
