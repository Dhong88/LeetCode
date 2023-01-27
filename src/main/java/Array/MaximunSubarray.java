package Array;

public class MaximunSubarray {
    /*
    max subarray can be
    [x] start a new element
    or
    [x,x,x] combination of several subarray
     */

    public static void main(String [] args) {

        int nums [] = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = nums[0];
        int combinationSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            // 1, -1 > 1
            combinationSum = Integer.max(nums[i] , combinationSum + nums[i]);  // restart or combination of a series of number
            maxSum = Integer.max(combinationSum, maxSum);
        }
        System.out.print(maxSum);
    }
}
