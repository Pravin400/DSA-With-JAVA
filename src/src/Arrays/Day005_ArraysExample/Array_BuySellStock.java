package Arrays.Day005_ArraysExample;

public class Array_BuySellStock {

    // Function to calculate maximum profit
    public static int buyAndSellStocks(int[] stockPrices) {
        int buyPrice = Integer.MAX_VALUE; // Initially set buy price to infinity
        int maxProfit = 0;

        for (int i = 0; i < stockPrices.length; i++) {
            // If we get a better selling opportunity
            if (stockPrices[i] > buyPrice) {
                int profit = stockPrices[i] - buyPrice;
                System.out.println("Sell Price: " + stockPrices[i] + " | Profit: " + profit);
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Update buy price if stock is cheaper
                buyPrice = stockPrices[i];
                System.out.println("Buy Price updated to: " + buyPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + buyAndSellStocks(stockPrices));
    }
}
