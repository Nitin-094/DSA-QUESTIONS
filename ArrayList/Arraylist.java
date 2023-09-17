import java.util.*;
public class Arraylist {

    public static void main(String[] args) {

        Arraylist l1 = new Arraylist();

        ArrayList<Integer> list1 = new ArrayList<>();
//
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
//
        l1.swap(list1,0,4);
        System.out.println(l1+"\n"+list1);


        System.out.println();


        for (int i = 0; i < list1.size(); i++) {
            
        }
//        Collections.sort(list1,Collections.reverseOrder());
//        l1.listReverse(list1);
//
//        System.out.println();
////        l1.max(list1);
//
//
//        int n =1000;
//        while(n>0){
//        for (int i = 0; i < n; i++) {
//
//            System.out.print(i+" ");
//            n=n/2;
//
//        }
//    }

    }


    void listReverse(ArrayList<Integer> list1){
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(list1.size()-i-1)+" ");
        }
    }


    void max(ArrayList<Integer> l1){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < l1.size(); i++) {

            int a = l1.get(i);
            max = Math.max(max,a);

        }
        System.out.print(max);
    }

    void swap(ArrayList<Integer> l1 , int i,int j){

        int temp = l1.get(i);
        l1.set(i,l1.get(j));
        l1.set(j,temp);

    }


}
