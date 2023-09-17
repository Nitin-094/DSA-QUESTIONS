public class count_lowercase {

    public static void main(String[] args) {

        String str = "";


        int count =0;

        for (int i = 0; i < str.length(); i++) {

            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }


        }


        System.out.println(str + " has "+ count + " lowercase characters");
    }


}
