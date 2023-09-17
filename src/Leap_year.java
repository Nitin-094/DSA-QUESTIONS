import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the year : ");
        int n = scan.nextInt();

        if (n%400==0 || n%100!=0 || n%4 == 0){
            System.out.println("Leap year");
        }
        else System.out.println("not leap year");
    }
}
