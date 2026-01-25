public class BuyandSellStock {
    public int maxProfit(int price[]) {
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                profit += price[i] - price[i - 1];
            }
        }
        return profit;
        // int n = price.length;
        // if (n == 0)
        // return 0;
        // int k = 0;
        // int buy = 0;
        // int sell = 0;

        // for (int i = 0; i < n; i++) {
        // if (price[i] < price[i + 1]) {
        // return 0;
        // } else if (price[i] > price[i + 1]) {
        // buy = price[i + 1];
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 1; j < n; j++) {
        // if (price[i] < price[j]) {
        // return 0;
        // } else if (price[i] > price[j]) {

        // }
        // }
        // }

        // return k;
    }

    public static void main(String[] args) {
        // int price[] = {};
        // int price[] = { 7, 1, 5, 3, 6, 4 };
        // int price[] = { 1, 2, 3, 4, 5 };
        int price[] = { 5, 4, 3, 2, 1 };
        BuyandSellStock solution = new BuyandSellStock();
        int profit = solution.maxProfit(price);
        System.out.println(profit);
    }
}
