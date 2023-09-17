public class string_comparisons {

    public static void main(String[] args) {

        String str = "Nitin";
        String str1 = "Nitin";
        String str2 = new String("Nitin");


        if(str == str2){
            System.out.println("similar");
        }
        else{
            System.out.println("not similar");
        }


        if(str.equals(str2)){
            System.out.println("similar");
        }
        else{
            System.out.println("not similar");
        }




    }



}
