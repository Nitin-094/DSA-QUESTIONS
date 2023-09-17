public class Trapping_Rainwater {

    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};

        //Calculate the left max boundary.
        int[] leftMax = new int[arr.length];

        leftMax[0] = arr[0];// as nothing is there in the left of the first bar.

        for (int i = 1; i < arr.length ; i++) {

            leftMax[i] = Math.max(arr[i],leftMax[i-1]);// comparing the current arr with the previous arr.
        }


        //Calculate the right max boundary.
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for (int i = arr.length-2 ; i>=0 ; i--) {
            rightMax[i]=Math.max(arr[i],rightMax[i+1]); // next element is the right element.

        }

        //Loop -
        //find waterlevel which is equal to min(leftMax,rightMax);
        //trappedWater = waterLevel-arr[i];
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {

            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += waterLevel - arr[i];

        }

        System.out.print(trappedWater);

    }
}
