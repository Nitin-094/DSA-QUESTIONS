import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        System.out.println(armstrong(a));
         for (int i=0 ; i <1000 ; i++){
             if (armstrong(i)){
                 System.out.print(i+" ");
             }
         }

   }

   static boolean armstrong(int a){
        int original = a;
        int neww =0;
        while(a > 0) {
           int rem = a%10;
           neww = neww + (rem*rem*rem);
           a=a/10;
//           if (a == 0) break;
        }

       return neww == original;
   }

}
