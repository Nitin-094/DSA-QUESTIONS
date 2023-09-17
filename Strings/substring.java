public class substring {

    static String substring(String str , int si , int ei){

        String sub_str="";
        for (int i = si; i < ei; i++) {

            sub_str += str.charAt(i);
        }

        return sub_str;
    }


    public static void main(String[] args) {

        String str = "HelloWorld";

        System.out.println(substring(str,0,5));

        System.out.println(str.substring(0,5));

    }


}
