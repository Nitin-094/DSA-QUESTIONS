import java.util.Scanner;
public class vowel_consonent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter the string : ");
            String s = scan.nextLine();
            char temp;
            String vow = "";
            String conso = "";

            for (int i = 0; i < s.length(); i++) {

                temp = s.toCharArray()[i];
                if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') vow = vow + temp;
                else conso = conso + temp;
            }
            System.out.println("vowels : " + vow + "\nconsonant : " + conso);
        }
    }
}
