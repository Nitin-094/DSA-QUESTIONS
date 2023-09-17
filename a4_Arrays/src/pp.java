import java.util.*;

import static java.sql.Types.INTEGER;

public class pp {
    public static void main(String[] args) {
        int key = 5;
        int[] arr = {-2,-1};
        
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            sum += arr[i];
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.println(Arrays.toString(prefix));

//        prefix[end] - prefix[start-1] in order ot calculate the

int maxSum = Integer.MIN_VALUE;
int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                 currSum =  i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                 maxSum = Math.max(currSum , maxSum);

            }
        }
        System.out.println(maxSum);
    }
}
