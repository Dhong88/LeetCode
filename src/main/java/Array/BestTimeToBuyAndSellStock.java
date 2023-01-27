package Array;

public class BestTimeToBuyAndSellStock {

    public static void main(String [] args) {

        /*
        take the lowest value and get the max profit between the price and lowest value
         */
        int [] prices = {7,1,5,3,6,4};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            minPrice = Integer.min(price, minPrice);
            maxProfit = Integer.max(maxProfit, (price - minPrice));
        }
        System.out.print(maxProfit);
    }
}
