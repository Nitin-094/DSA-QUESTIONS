//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class MAX_min {
    public static void main(String[] args) {
        System.out.println(max(1,2,3));
        System.out.println(min(1,2,3));
    }
    static int max(int a , int b ,int c){

        if (a>b && a>c) {
            return a;
        }
        if (b>a && b>c) {
            return b;
        }
        else return c;
    }

    static int min(int a,int b,int c){
        if (a<b && a<c) {
            return a;
        }
        if (b<a && b<c) {
            return b;
        }
        else return c;



    }


}
