// To check whether the given number is Armstrong or not!

import java.util.Scanner;
public class Q9 {
       public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
           while(true){

               System.out.println("Input a number : - ");
               int orgnl = scan.nextInt();

               int r = 0, neww = 0, org1 = orgnl;

               while (org1 > 0) {

                   r = org1 % 10;
                   neww = neww + (r * r * r);
                   org1 = org1 / 10;
               }

               if (neww == orgnl) {
                   System.out.print("The given number " + orgnl + " has armstrong number : " + neww);
               } else System.out.println(orgnl + " is not equal to " + neww);
           }


        }
    }