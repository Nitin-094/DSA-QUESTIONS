import java.util.ArrayList;
import java.util.Scanner;
public class two_dimensional {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        ArrayList<Integer> list = new ArrayList<>(10);

        System.out.println("enter : ");
        for (int i = 0; i < 5; i++) {

            list.add(scan.nextInt());

        }
//        System.out.println(list);


        for (int i = 0; i < 5; i++) {

            System.out.print(list.get(i)+" ");

        }


    }
}