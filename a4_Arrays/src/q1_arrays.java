
import java.util.Arrays;
import java.util.Scanner;
public class q1_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums={1,2,3,4,5};
        int[] Sum = new int[nums.length];
        Sum[0]=nums[0];

        for (int i = 0; i < nums.length-1; i++) {


            Sum[i+1] = Sum[i] + nums[i+1];

            // 0 [1] = [0] + [1]  == [1+1]
            // 1 [2] = [1] + [2]  == [3+3]

        }

        System.out.println(Arrays.toString(Sum));


}
}
