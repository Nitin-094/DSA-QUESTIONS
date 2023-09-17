// Find if any pair in the sorted ArrayList has a target sum.
import java.util.*;
public class PairSum1 {

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
//        for (int i = 1; i < 7; i++) {
//            l1.add(i);
//        }

        l1.add(11);l1.add(15);l1.add(6);l1.add(8);l1.add(9);l1.add(10);


    PairSumRotatedArr(l1,16);
    }

    static void PairSumRotatedArr(ArrayList<Integer> l1 , int key){

        int pivot=-1;  // Max
        int n = l1.size();

        for (int j = 0; j < l1.size(); j++) {
            if(l1.get(j)> l1.get(j+1)){
                pivot=j;
                break;
            }
        }
        int Rptr = pivot;
        int Lptr = pivot+1;

        while(Lptr != Rptr){
            if((l1.get(Rptr)+l1.get(Lptr)) == key){
                System.out.print("(" + l1.get(Lptr) + "," + l1.get(Rptr) + ")" + " ");
                break;
            }
            if((l1.get(Rptr)+l1.get(Lptr)) < key){
                Lptr = (Lptr+1)%n;
            }else{
                Rptr = (n+Rptr-1)%n;
            }

        }





    }



    static int PairsumTwoPtr(ArrayList<Integer> l1, int key){
        int Lptr = 0;
        int Rptr = l1.size()-1;

        while(Lptr < Rptr ){
            if (l1.get(Lptr) + l1.get(Rptr) == key) {
                System.out.print("(" + l1.get(Lptr) + "," + l1.get(Rptr) + ")" + " ");
                break;
            } else if (l1.get(Lptr) + l1.get(Rptr) < key) {
                Lptr++;
            } else {
                Rptr--;
            }
        }
return -1;
    }

    static void PairsumBrute(ArrayList<Integer> l1 ,int key ){
        for (int i = 0; i < l1.size(); i++) {
            for (int j = i+1; j < l1.size() ; j++) {
                if((l1.get(i)+l1.get(j)) == key){
                    System.out.print("("+l1.get(i)+","+l1.get(j)+")"+" ");
                }
            }
            System.out.println();
        }
    }
}




