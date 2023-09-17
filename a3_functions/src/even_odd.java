import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class even_odd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        eve_odd(n);
    }
    static void eve_odd(int a){

        if (a % 2 == 0) {
            System.out.println("even");
        }
        else System.out.println("odd");


    }

}
