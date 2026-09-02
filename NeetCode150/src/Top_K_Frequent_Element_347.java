import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Top_K_Frequent_Element_347{
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,2,3,3,3,3};
        int k = 2;

        System.out.println(Arrays.toString(FrequentElement(nums,k)));
    }

    public static int[] FrequentElement(int[] arr,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int n : arr){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        Queue<Integer> queue = new PriorityQueue<>(
                (a,b)->(hm.get(a)-hm.get(b))
        );

        for(int n : hm.keySet()){
            queue.add(n);

            if(queue.size()>k){
                queue.poll();
            }
        }

        int[] ans = new int[k];

        int i=0;

        while(!queue.isEmpty()){
            ans[i]= queue.poll();
            i++;
        }

        return ans;
    }
}
