import java.util.Arrays;
public class VarArgs {

    public static void main(String[] args) {
        fun(1,2,3,2,34,234,23,42,4,234,2,34,234,2,34,2);
    }

    static void fun(int ...a) {
        System.out.println(Arrays.toString(a));
    }
    static void funn(int  a , String ...b){

    }
}
