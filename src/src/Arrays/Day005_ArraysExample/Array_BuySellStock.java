package Arrays.Day005_ArraysExample;

public class Array_BuySellStock {
    public static int byuAndSellStocks(int[] stockPrices){
         int buyPrice = Integer.MAX_VALUE;
         int maxProfit = 0;

         for(int i = 0; i < stockPrices.length; i++){
             if(stockPrices[i] > buyPrice){
                 int Profit = stockPrices[i] - buyPrice;
                 System.out.println("sell Price: " + stockPrices[i] + " Profit: " + Profit);
                 maxProfit = Math.max(maxProfit, Profit);
             }
             else {
                 buyPrice = stockPrices[i];
                 System.out.println("Buy Price is " + buyPrice);
             }

         }
         return maxProfit;
    }

    public static void main(String[] args) {
        int[]  stockPrice= {7,1,5,3,6,4};
        System.out.println(byuAndSellStocks(stockPrice));
    }
}
