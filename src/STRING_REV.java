import java.util.Scanner;

public class STRING_REV {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = scan.nextLine();
        String neww="";

        for (int i = s.length()-1; i >= 0 ; i--) {
//            neww = neww + s.toCharArray()[i];
            neww = neww + s.charAt(i);
        }

        System.out.println(neww);


    }


}
