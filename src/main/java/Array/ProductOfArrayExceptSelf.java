package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /*
    before
    1 [1,2,3,4]
    [1, 1, 2, 6]

    after
     [1,2,3,4] 1
     *start from end
     [24,12,,4,1]

     times together
     */
    public static void main(String [] args) {
        int [] nums = {1,2,3,4};

        int length = nums.length;

        int [] before = new int[length];
        int [] after = new int[length];
        int [] ans = new int[length];

        before [0] = 1;
        for(int i = 1; i < length ; i++) {
            before [i] = before [i - 1] * nums [i - 1];
        }
        after[length - 1] = 1;
        for(int j = length -  2; j >= 0 ; j--) {
            after [j] = after [j + 1] * nums [j + 1];
        }

        for(int i = 0; i < length ; i++) {
            ans [i] = after[i] * before [i];
        }
        Arrays.stream(ans).forEach(x -> System.out.print(x));
    }
}
