import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target =9;

        System.out.println(Arrays.toString(TwoSum2(nums,target)));
    }

    public static int[] TwoSum2(int[] nums, int target){
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int sum = nums[low]+nums[high];

            if(sum==target) return new int[]{low+1,high+1};

            if(sum<target){
                low++;
            }else{
                high--;
            }
        }

        return new int[]{};
    }
}