//Given a 2xn board and tiles of size 2x1 ,count the number of ways to tile the given board using the 2x1 tiles.(A tile can either be placed horizontally or vertically.)

public class TilingProblem {

    public static void main(String[] args) {
        System.out.println(tileWays(4));
    }

    static int tileWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        //for vertical ways
        int countVertical = tileWays(n-1);

        //for horizontal ways
        int countHorizontal = tileWays(n-2);

        return countHorizontal+countVertical;

    }


}


