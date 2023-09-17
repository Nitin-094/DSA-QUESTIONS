public class compression{

    public static String compression(String s){

    StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
        Integer count =1;

            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                i++;
                count++;
            }
                sb.append(s.charAt(i));

            if (count>1){
                sb.append(count);
            }


        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "aaabbbccc";

        System.out.println(compression(str));
        System.out.println(compression("nnnnnnniiiiiiittttttttiiiiiiinnnnnnn"));System.out.println(compression("nitin"));System.out.println(compression("abc"));



    }


}
