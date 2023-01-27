package Array;

public class maxProduct {
    /*
    same as MaximunSubarray, Kadane's Algorithm

    but since when negative value, negative * negative will give max value, reverse the min as max number when the next
    num is negative
     */
    public static void main (String [] args) {

        int nums [] = {2,3,-1,1,-3,3,0};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int max= nums[0];
        int maxValue = nums[0];
        // extra
        int minValue = nums[0];
        for(int i = 1; i< nums.length; i++) {
            //reverse min max when negative value as -- > +
            if(nums[i] < 0) {
                int temp = maxValue;
                maxValue = minValue;
                minValue = temp;
            }
            maxValue = Integer.max(maxValue * nums[i], nums[i]);
            minValue = Integer.min(minValue * nums[i], nums[i]);
            max = Integer.max(max, maxValue);
        }
        return max;
    }
}
