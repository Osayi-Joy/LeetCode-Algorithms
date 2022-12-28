package algorithms;

public class RotateArray {
    //TODO 189. Rotate Array
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        System.out.println(k);
        int[] clone = nums.clone();
        for(int i=0;i<len;i++) nums[(i+k)%len] = clone[i];

        return;
    }
}
