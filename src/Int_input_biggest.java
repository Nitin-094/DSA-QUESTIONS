//Take integer inputs till the user enters 0 and print the largest number from
//all.
import java.util.Scanner;

public class Int_input_biggest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int j=0;
        while(true){
            System.out.print("Input number : ");
            int n = scan.nextInt();

            if (n > j){
                j=n;
            }
            if(n==0){
                System.out.println("The largest number is : "+ j);
            break;
            }



        }



    }
}
