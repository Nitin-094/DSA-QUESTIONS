import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
// you can also use the Arrays.equals() instead of the for loop
        String a = "Racecar";
        String b = "carrace";


        char[] arr = (a.toLowerCase()).toCharArray();
        char[] arr1 = (b.toLowerCase()).toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        int count=0;
        if(arr.length == arr1.length){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr1[i]){
                    count++;
                }
            }
        }
        System.out.println(count +" "+ arr.length);

        if(count == arr.length){
            System.out.println("both are anagrams");
        }
        else System.out.println("Not anagrams");

    }
}
