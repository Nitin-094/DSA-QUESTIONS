import java.util.Scanner;

public class Ele_bill {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the units consumed : ");
        float units = scan.nextFloat();
        double bill=0;

        if (units <= 50.00){
            bill = units*3.50;
        }
        if (units <= 150.00 && units > 50.00){
            bill = 50.00*3.50 + (units-50.00)*4.00;
        }
        if (units <= 250.00 && units > 150.00){
            bill = 50.00*3.50 + 100*4 + (units-150)*5.20;
        }
        if (units >= 250.00){
            bill = 50.00*3.50 + 100*4 + 100*5.20 +(units-250)*6.50;
        }

        System.out.println("the payble amount is : "+ (float)bill);




    }
}
