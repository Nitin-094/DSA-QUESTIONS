import java.util.ArrayList;
import java.util.Scanner;
public class Multi_dim_AL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //intialising the new array list within a array list  [[],[],[],[].........]
        for (int i = 0; i < 5; i++) {

            list.add(new ArrayList<>());

        }

            // i for rows and j for columns
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {

                list.get(i).add(scan.nextInt());

            }
        }

        System.out.println(list);



    }

}
