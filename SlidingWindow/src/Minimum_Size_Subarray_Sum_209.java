public class Minimum_Size_Subarray_Sum_209 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(minSubArrayLen(arr,target));
    }

    public static int minSubArrayLen(int[] arr, int target){

        //Initialising Two pointer from 0
        int high=0; //Moving along with iteration and add on
        int low=0; //Move when condition hits and remove

        int len = Integer.MAX_VALUE;
        int sum=0;
        while(high<arr.length){
            sum +=arr[high];

            while(sum>=target){                //Required Condition
                len = Math.min(len,high-low+1);
                sum-=arr[low];
                low++;
            }

            //loop will executed until condition violated

            high++;
        }

        return len==Integer.MAX_VALUE?0:len;
    }
}
