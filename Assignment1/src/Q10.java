// To print the armstrong numbers between the given range of numbers.
import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int orignal = input.nextInt();
        int update=0;
        int rem=0;
        int n;
        System.out.println("enter the second number : ");
        int a2 = input.nextInt();
        for (int j = orignal; j < a2; j++) {
                   n=j;
            while (n != 0) {
                rem = n%10;
                update = update + (rem*rem*rem*rem) ;
                n = n/ 10;
            }
            if (update == j) {
                System.out.println(j);
            }
            update = 0;
        }
    }
}






