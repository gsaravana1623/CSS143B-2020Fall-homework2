public class Problem1 {

    /*
    if current is 0, p1 needs to be swapped with pointer, and then increment p1.
    if current is 2, p2 needs to be swapped with pointer, and the decrement p2
    additionally, "p2--" may be swapped an extra 0 from the end of array requires extra processing
    thus decrement the index for it
    lastly, this will move to the next index to make progress
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int p0 = 0, p1 = nums.length - 1, index = 0;
        while (index <= p1) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p0++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p1];
                nums[p1] = 2;
                p1--;
                index--;
            }
            index++;
        }

    }
}
