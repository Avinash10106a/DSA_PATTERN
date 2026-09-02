import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum_15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = ThreeSumSolve(nums);

        for(List<Integer> list : ans ){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> ThreeSumSolve(int[] nums){

        Arrays.sort(nums);

        List<List<Integer>> ls = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int low=i+1;
            int high=nums.length-1;

            while(low<high){
                int sum = nums[low] + nums[high];
                int target = -1 * nums[i];

                if(sum==target){
                    ls.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;

                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }

                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                } else if(sum<target){
                    low++;
                }else{
                    high--;
                }

            }
        }

        return ls;

    }
}
