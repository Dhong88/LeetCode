package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main (String [] args) {
        int [] nums = new int[]{3,2,4};
        int target = 6;
        int [] output = new int[2];

        Map<Integer, Integer> components = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];  // answer push as key and position as value
            if(!components.containsKey(nums[i]))
                components.put(ans, i);
            else
                System.out.print(i+ " "+ components.get(nums[i]));
        }

    }


}
