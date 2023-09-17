import java.util.*;
public class MultiDim {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> l4 = new ArrayList<>();
//
        // For printing the ArrayList.

//        l1.add(2); l1.add(4); l1.add(6);
//        l3.add(l1);
//
//        l2.add(4); l2.add(5); l2.add(6);
//        l3.add(l2);
//
//        for (int i = 0; i < l3.size(); i++) {
//
//            ArrayList<Integer> currList = l3.get(i);
//
//            for (int j = 0; j < currList.size(); j++) {
//
//                System.out.print(currList.get(j )+" ");
//
//            }
//            System.out.println();
//
//        }


        for (int i = 1; i <11 ; i++) {

            l1.add(i*2);
            l2.add(i*3);
            l3.add(i*4);

        }


     l4.add(l1); l4.add(l2); l4.add(l3);

        for (int i = 0; i < l4.size(); i++) {

            ArrayList<Integer> currList = l4.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j)+" ");

            }
            System.out.println();
        }








        
    }
}
