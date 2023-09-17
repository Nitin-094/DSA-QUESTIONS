import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Radius : ");
        int r = scan.nextInt();
        int area = (22/7)*r*r;
        System.out.println("The area is : " + area);

    }
}
