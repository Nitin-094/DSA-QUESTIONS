public class largest_string {
    public static void main(String[] args) {
        String[] arr = {"Apple","mango","Banana","z","Z"};
        //lexicographically
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            String new1 = arr[i];
            if (largest.compareTo(new1)<0){
                largest = new1;
            }
        }
        System.out.println(largest);
    }
}
