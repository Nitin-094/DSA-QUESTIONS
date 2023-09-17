//To find out whether the given string is in palindrome or not.

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the string : ");
        String a = input.nextLine();
        String b = "";
        for (int i = a.length()-1; i > -1 ; i--) {

            //      b = b + (a.charAt(i));

            b = b + (a.toCharArray())[i];
            b = b + a.charAt(i);



        }

      if(a.equals(b)){
          System.out.println("palindrome found "+a+" = "+b);
      }
        else {
          System.out.println("no palindrome found "+a+" != "+a);
      }
    }
}
