public class Q4 {

    static int rainwater(int[] arr){

        int[] leftMax= new int[arr.length];
        leftMax[0]=arr[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }

        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for (int i = rightMax.length-2; i>=0 ; i--) {
            rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        }

        int waterLevel = 0;

        for (int i = 0; i < arr.length; i++) {
            int singleWaterLevel = Math.min(leftMax[i],rightMax[i]) - arr[i];
            waterLevel += singleWaterLevel;
        }

        return waterLevel;
    }


    public static void main(String[] args) {

        int[] height={4,2,0,3,2,5};

        System.out.println(rainwater(height));

    }



}
