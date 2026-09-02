import java.util.Arrays;

public class Two_Sum_II_167 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(pairsII(arr, target)));
    }

    public static int[] pairsII(int[] arr,int target){

        int low=0;
        int high=arr.length-1;

        while(low<high){
            int sum = arr[low]+arr[high];

            if(sum==target){
                return new int[]{low+1,high+1};
            }

            if(sum>target){
                high--;
            }else{
                low++;
            }
        }

        return new int[]{};
    }
}
