public class Stock {
        public static void main(String[] args){

            int[] arr = {7,6,4,3,1};

            int buyPrice = arr[0];
            int sellingPrice = 0;
            int[] profit = new int[arr.length];
            int maxProfit = 0;
            profit[0] = 0;
            for (int i = 1; i < arr.length; i++) {

                buyPrice = Math.min(buyPrice,arr[i]);
                sellingPrice = arr[i];

                profit[i] = sellingPrice - buyPrice;

//                maxProfit = profit[i]>maxProfit ? profit[i] : maxProfit;
                maxProfit = Math.max(profit[i], maxProfit);

            }

            System.out.println(maxProfit);

        }




}
