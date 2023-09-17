public class gridways {
    static int gridWays(int i ,int j ,int r , int c){
        // i , j are start and r , c are the target!!
        if(i == r-1 && j == c-1){ // if the target value is achieved.
            return 1;
        }else if(i == r || j == c){  // if it collides with the boundary wall.
            return 0;
        }

        int w1 = gridWays(i+1,j,r,c);
        int w2 = gridWays(i,j+1,r,c);
        return w1+w2;
    }
    public static void main(String[] args) {
        System.out.println(gridWays(0,0,3,3));
    }
}
