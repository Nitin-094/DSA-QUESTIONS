// Write a program to print whether a number is even or odd, also take the input from the user.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] abc) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the required number: ");
        int a = input.nextInt();

        if (a%2==0){
            System.out.println("Even!");
        }
        else{
            System.out.println("Odd!");
        }




    }

}
