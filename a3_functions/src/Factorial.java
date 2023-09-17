//[Write a program to print the factorial of a number by defining a method named 'Factorial'
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial((5)));
    }
    static int factorial(int a){
        if(a==1 || a==0 ) return 1;

        if(a<0) System.out.println("enter a positive number");

        int mul =1;
        for (int i = a; i>0 ; i--) {
            mul = mul*i;
        }
        return mul;
    }
}
