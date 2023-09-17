//Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once.
// Find out the total number of ways in which friends can remain single or can be paired up.
public class FriendsPairing {
    public static void main(String[] args) {

        friedns f1 = new friedns();
        System.out.println(f1.friednsPair(5));

    }
}

class friedns{

    public static int friednsPair(int n){

        if(n==1 || n==2){
            return n;
        }
//        //single
//        int single = friednsPair(n-1);
//        //pairs
//        int pairs = (n-1)*friednsPair(n-2);
//
//       return single+pairs;

        return friednsPair(n-1) + (n-1)*friednsPair(n-2);

    }

}