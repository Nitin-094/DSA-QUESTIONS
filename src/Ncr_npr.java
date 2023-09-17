import java.util.Scanner;

public class Ncr_npr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n and r : ");
        int n = scan.nextInt();
        int r = scan.nextInt();

        int n_facto = 1;
        int r_facto = 1;
        int nr_facto = 1;

        // for loop for n!
        for (int i = 1; i <=n ; i++) {

            n_facto = n_facto * i;
        }

        //for loop for r!
        for (int i = 1; i <= r; i++) {

            r_facto = r_facto*i;
        }

        // for loop for (n-r)!
        for (int i = 1; i <= (n-r) ; i++) {

            nr_facto = nr_facto * i;
        }

        float ncr = n_facto/((r_facto)*(nr_facto));

        float npr = n_facto/(nr_facto);

        System.out.println("ncr : "+ncr+" npr : "+npr);


        System.out.println(r_facto);

    }

}
