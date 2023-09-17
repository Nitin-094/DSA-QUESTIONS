//Write a program to input principal , time and rate (P,R,T) from the user and find simple interest.

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter p : ");
        int p = input.nextInt();
        System.out.println("enter r : ");
        float r = input.nextFloat();
        System.out.println("enter t : ");
        int t = input.nextInt();

        float Si = (p*r*t)/100;
        System.out.println("simple interest : " + Si+"\n" + "Total amount = "+(Si+p));







    }
}
