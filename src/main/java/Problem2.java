public class Problem2 {

    /*

    for example, if 111222333 was used, each time a number is different, it is a new number
    thus we put this in index res and increment res.
    similar to quicksort but not the same.
    also has some similarity with partitioning
    as each number is run in the loop, each value is replaced with index value

     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {


        if(nums.length == 0) return 0;
        int res = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i - 1]){
                nums[res] = nums[i];
                res++;
            }
        }
            return Integer.MAX_VALUE;


    }
}

