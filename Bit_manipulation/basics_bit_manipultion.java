public class basics_bit_manipultion {

    public static boolean odd_even(int n){
        System.out.print("Is " + n + " EVEN = ");
        return (n & 1) == 0;
    }

    public static int i_th_bit(int n , int i){
        int bitmask = 1<<i;
        if ((n&(bitmask)) == 0){
            return 0;
        }
return 1;
    }

    public static int i_th_bit_set(int n , int i){
        int bitmask = 1<<i;
        return (n|bitmask);

    }

    public static int i_th_bit_clear(int n , int i){

//        int bitmask = 1<<i;
//        return n^bitmask;
        int bitmask = ~(1<<i);
        return n&bitmask;
    }

    public static int clear_last_ibits(int n , int i){
//        n = n>>i;
//        n = n<<i;
//        return n;

        int BitMask = (-1)<<i;
        return n&BitMask;
        }


        public static int clear_i_range(int n , int i , int j){

        int a = (~0)<<j+1;
        int b = (1<<i)-1;

        int bitmask = a|b;

        return n&bitmask;
        }

        public static boolean is_power_of_two(int n){

        return ((n&(n-1)) == 0);

        } 
        
        public static int count_set_bits(int n){
        int count = 0;
            while(n>0){
                if ((n & 1) == 1 ){
                    count++;
                }
                n = n>>1;
            }
            return count;
        
        }
    public static int Fast_exp(int a , int n){
        int ans =1;
        while(n >0){
            if((n&1) != 0 ){//check LSB
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
    return ans;
    }






    public static void main(String[] args) {

        int n =3;
//        System.out.print(odd_even(n));
//
//        System.out.println();
//
//        System.out.print(i_th_bit(3,0));
//        System.out.println();
//        System.out.print(i_th_bit_set(3,0));
//        System.out.println();
//        System.out.print(i_th_bit_clear(10,1 ));
//        System.out.println(clear_i_range(10,2,4 ));
//        System.out.println(count_set_bits(16));
          System.out.println(Fast_exp(5,1000000 ));
    }
}
