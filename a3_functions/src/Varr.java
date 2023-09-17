import java.util.Arrays;

public class Varr {
    public static void main(String[] args) {

        varr("nitin",2,23,2,23,2,34,234,23,42,34,234,23,4,234,23,42,3);
    }

    static void varr(String b, int ...a) {
//        a[0]=99;
        System.out.println(Arrays.toString(a));
        System.out.println(b);
//        System.out.println(a[9]);
    }


}
