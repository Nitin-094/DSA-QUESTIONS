public class SubSets {

    static void subSets(String str , String ans , int i){

        //base case

        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("NULL");
                return;
            }
            System.out.println(ans);
            return;
        }


        //recursion
        //yes choice
        subSets(str,ans+str.charAt(i) , i+1);
        //no choice
        subSets(str,ans,i+1);




    }


    public static void main(String[] args) {

        String str = "abc";
        subSets(str , "",0);

    }

}
