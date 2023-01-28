package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};

        int ans = Arrays.stream(nums).min().getAsInt();

        int min = Integer.MAX_VALUE;
        for(int i = 0; i< nums.length ; i++) {
            if(nums[i] < min)
                min = nums[i];
        }

        System.out.print(min);
    }
}
