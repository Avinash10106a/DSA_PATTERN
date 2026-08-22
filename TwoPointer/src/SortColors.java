import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        int start=0;
        int mid=0;
        int end = nums.length-1;

        while(mid<=end){
           if(nums[mid]==2){
               int temp = nums[mid];
               nums[mid]=nums[end];
               nums[end]=temp;
               end--;
           }else if(nums[mid]==0){

               int temp = nums[mid];
               nums[mid]=nums[start];
               nums[start]=temp;
               start++;
               mid++;
           }else{
               mid++;
           }
        }

        System.out.println(Arrays.toString(nums));
    }
}
