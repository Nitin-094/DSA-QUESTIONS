//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input n : ");
       
        
        int neg_sum=0;
        int pos_even_sum=0;
        int pos_odd_sum=0;
        while(true){
            int n = scan.nextInt();
            if(n>=0 && n%2 == 0) pos_even_sum = pos_even_sum + n;
            if (n>=0 && n%2 != 0) pos_odd_sum = pos_odd_sum + n;
            if (n<0) neg_sum = neg_sum + n;
            if (n==0) System.out.println("even sum : "+pos_even_sum+"\nodd sum : "+pos_odd_sum+"\nnegative sum : "+neg_sum);


        }

    }


}
