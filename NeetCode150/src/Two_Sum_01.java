import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum_01 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 7;

        System.out.println(Arrays.toString(pairs(arr,target)));
    }

    public static int[] pairs(int[] arr , int target){

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int rem = target - arr[i];

            if(hm.containsKey(rem)){
                return new int[]{hm.get(rem),i};
            }

            hm.put(arr[i],i);
        }

        return new int[]{};
    }
}
