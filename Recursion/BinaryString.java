public class BinaryString {
    public static void main(String[] args) {
        BinaryString(3,0,"");
    }

    static void BinaryString(int n , int lastPlace , String str){

        if(n==0){
            System.out.println(str);
            return;
        }
        BinaryString(n-1,0,str+"0");
        if(lastPlace==0){
            BinaryString(n-1,1,str +"1");
        }
    }
}
