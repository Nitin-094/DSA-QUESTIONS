public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "nitin";
        removeDuplicates(str,0,new StringBuilder("") , new boolean[26]);
    }

    public static void removeDuplicates(String provided ,int i ,StringBuilder newStr ,boolean[] map){
         if(i == provided.length()) {
             System.out.println(newStr);
             return;
         }
        char currChar=provided.charAt(i);

         if(map[currChar-'a'] == true){
//             duplicate
             removeDuplicates(provided,i+1,newStr,map);
         }else{
             map[currChar-'a'] = true;
             removeDuplicates(provided,i+1,newStr.append(currChar),map);
         }
     }
}
