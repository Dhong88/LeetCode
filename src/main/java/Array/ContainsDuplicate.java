package Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String [] args) {
        int nums [] = {1,2,3,1};
        Set <Integer> keys = new HashSet();
        for(int num : nums) {
            if(!keys.contains(num))
                keys.add(num);
            else
                System.out.print(true);
        }
    }
}
