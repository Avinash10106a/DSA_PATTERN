public class Max_Sum_Subarray_of_size_K_GFG {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400};
        int k=2;

        System.out.println(maxSubarraySum(arr,k));
    }

    public static int maxSubarraySum(int[] arr, int k) {
        // Code here
        int high = 0;
        int low = 0;


        int currSum = 0;
        //firstWindow
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        int maxSum = currSum;

        for (int i = k; i < arr.length; i++) {
            currSum += arr[i];
            currSum -= arr[i - k];

            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}