//Kunal is allowed to go out with his friends only on
// the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.Scanner;

public class Even_Days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of days : ");
        int n = scan.nextInt();


        if(n>=2 && n%2==0 ) System.out.println("number of days = "+ n/2);
        if (n==31) {
            System.out.println("number of daysss = "+ (n-1)/2);

        } else System.out.println("enter vaild n ");


    }
}
