public class Q3 {

    static int stock(int[] arr){

        int buy = arr[0];
        int[] profit = new int[arr.length];
        profit[0]=0;
        int max_profit=0;

        for (int i = 1; i < arr.length; i++) {

            buy = Math.min(arr[i],buy);
            // daily selling price
            profit[i] = arr[i] - buy ;


            max_profit = Math.max(max_profit,profit[i]);

        }

        if (max_profit<=0){
            return -1;
        }
        return max_profit;
    }

    public static void main(String[] args) {

        int[] prices={7,5,3,2,1};

        System.out.println(stock(prices));


    }


}
