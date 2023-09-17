
public class practise {
    public static void main(String[] args) {

        int[] prices = {7,6,4,3,1};
        int[] profit= new int[prices.length];
        int buyP=prices[0] , sellP=0;
        for (int i = 1; i < prices.length; i++) {
             buyP = Math.min(prices[i],buyP);
             sellP = Math.max(prices[i],buyP);
             int a = sellP - buyP;
             profit[i] = Math.max(a,profit[i]);
        }
        int max= profit[0];
        for (int i = 1; i < profit.length; i++) {
            max = Math.max(profit[i],profit[i-1]);
        }
        System.out.println(max);
        }
    }