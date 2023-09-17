public class R_C_W {

    public static void main(String[] args) {

        int[][] accounts = {{1,2,3},{3,2,1},{4,5,6}};

        int max =0;

        for (int i = 0; i < accounts.length; i++) {
            int sum =0;
            for (int j = 0; j < accounts[i].length; j++) {
                System.out.print(accounts[i][j]+" + ");
                sum += accounts[i][j];
//                max = sum > max ?  sum : max ;
                max = Math.max(sum,max);
            }
            System.out.print(" = "+sum);
            System.out.println();
        }
        System.out.println(max);
    }
}
