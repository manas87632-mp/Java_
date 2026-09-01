public class stockMarket {

	public static void main(String[] args) {
		


        int[] prices = {5, 3, 1, 6, 13, 7, 8};

        if (prices.length < 2) {
            System.out.println("Not enough data to calculate profit.");
            return;
        }

        int minPrice = prices[0];
        int maxProfit = 0;
        int buyDay = 0;
        int sellDay = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                buyDay = i;
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
                sellDay = i;
            }
        }

        System.out.println("Buy on day " + buyDay + " at price " + prices[buyDay]);
        System.out.println("Sell on day " + sellDay + " at price " + prices[sellDay]);
        System.out.println("Maximum Profit: " + maxProfit);
    }


	}