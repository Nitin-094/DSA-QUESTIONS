import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            System.out.println("Enter n : ");
            int n = scan.nextInt();
            System.out.print(prime(n));

    }
    static boolean prime(int a){
        if (a <=1 ) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            // non prime condition!!
            if (a%i == 0 ){
                return false;}
        }
        return true;
    }


}
//
//__________________
//        import java.util.Scanner;
//public class practise{
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter a number : ");
//        int n = scan.nextInt();
//
//        for (int i =2;i<n;i++){
//            if (n%i == 0){
//                System.out.println("NOT prime");
//                break;
//            }
//            else {
//                System.out.println("prime number");
//                break;
//            }
//        }
//
//
//
//
//    }
//}