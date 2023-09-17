import java.util.Scanner;
public class Vowel_consonant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter some character : ");
            char c = scan.next().trim().charAt(0);
            System.out.println(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("vowel");
            } else System.out.println("consonant");

        }
    }
}