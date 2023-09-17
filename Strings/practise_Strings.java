import java.util.*;
public class practise_Strings {

    public static void main(String[] args) {

        String str = "my name is nitin kumar";
        StringBuilder sb = new StringBuilder("");
        char ch = 'a';

            if (Character.isLowerCase(str.charAt(0))){
                sb.append(Character.toUpperCase(str.charAt(0)));
            }

        for (int i = 1; i < str.length(); i++) {

            if (i < str.length()-1 && str.charAt(i)==' ' ){
                sb.append(str.charAt(i));
                 i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
          else{
                sb.append(str.charAt(i));
            }


        }

        System.out.println(sb.toString());



    }

}
