//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1221));

    }

    static boolean palindrome(int a){

            int j = a;
            int neww=0;
            while(j>0){
                int rem = j%10;
                neww = (neww*10) + rem;
                j=j/10;
            }

            return neww==a;
    }



}

