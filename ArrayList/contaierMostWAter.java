import java.util.*;

public class contaierMostWAter {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);l1.add(8);l1.add(6);l1.add(2);l1.add(5);l1.add(4);l1.add(8);l1.add(3);l1.add(7);

        System.out.println(storeWaterO(l1));


    }

    static int storeWater(ArrayList<Integer> l1){
        int area = 0;
        for (int i = 0; i < l1.size(); i++) {

            for (int j = i+1; j < l1.size() ; j++) {

                int len = Math.abs(i - j);
                int breadth = Math.min(l1.get(i) , l1.get(j));

                area = Math.max(len*breadth,area);
            }

        }
        return area;

    }

    static int storeWaterO(ArrayList<Integer> l1){
        int Lptr = 0;
        int Rptr = l1.size() - 1;
        int area = 0;
        while(Lptr < Rptr){
//  Calculating area
            int length = Rptr - Lptr;
            int breadth = Math.min(l1.get(Lptr),l1.get(Rptr));
            int max = length*breadth;

            area = Math.max(max,area);
//  update the pointer

            if(l1.get(Lptr) < l1.get(Rptr)){
                Lptr++;
            }else {
                Rptr--;
            }

        }

        return area;
    }


}

