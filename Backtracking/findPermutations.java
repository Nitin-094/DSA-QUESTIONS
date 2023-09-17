public class findPermutations {
    static void permutations(String str , String ans ){

        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Nstr = str.substring(0,i) + str.substring(i+1) ; // first and second part of string
            permutations(Nstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str,"");
    }
}
