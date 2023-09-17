//inr to usd

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("Enter inr : ");
            Float a = input.nextFloat();
            if (a > 0) {
                System.out.print("converted to usd =$ "+ (a/70));
                        }
            else{
                System.out.print("The inr should be greater than 0");
                        }

            System.out.println("\n");
        }

    }

}
