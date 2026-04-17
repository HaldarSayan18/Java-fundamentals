/*

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

*/

import java.util.Scanner;

public class BuySell_Stock {
    public int buy_sell_stock(int [] prices){
        int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            int profit = prices[j] - prices[i];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
    };
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // int buyOn = sc.nextInt();
        // int sellOn = sc.nextInt();
		int [] prices = {7,1,5,3,16,4};
		Main ob = new Main();
		int maxProfit = ob.buy_sell_stock(prices);
		System.out.println(maxProfit);
	}
}
