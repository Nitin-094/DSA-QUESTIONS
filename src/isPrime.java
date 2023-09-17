public class isPrime {

    public static void main(String[] args) {

     int n = 50;
int t = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i-1 ; j++) {
                if (i % j == 0) {
                    t+=1;
                }
            }
                if (t == 0){
                    System.out.print(i+" ");

                }
                else {
                    t=0;

            }
        }



    }
}
