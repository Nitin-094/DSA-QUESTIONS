//Write a function that returns the sum of first n natural numbers.
public class sum {
    public static void main(String[] args) {
        System.out.println(sum_var(1,2,3,4,5));
    }

    static int sum_var(int ...a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        return sum;
    }

}
