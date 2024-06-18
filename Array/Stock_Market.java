package in.co.Array;

public class Stock_Market {

    public static int buyAndSellStocks(int prices[]){
        int buyPrices = Integer.MAX_VALUE;
        int maxProfit =0;

        for (int i=0;i<prices.length;i++){

            if (buyPrices<prices[i]){
                int pofit = prices[i]-buyPrices;
                maxProfit = Math.max(maxProfit,pofit);
            }else {
                buyPrices = prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(prices));

    }
}
