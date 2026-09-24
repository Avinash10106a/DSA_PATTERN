public class Best_Time_To_Buy_And_Sell_Stocks_121 {
    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){

        int buy = prices[0];
        int profit = 0;

        for(int n: prices){

            if(buy>n){
                buy=n;
            }

            profit = Math.max(profit,n-buy);
        }

        return profit;
    }
}
