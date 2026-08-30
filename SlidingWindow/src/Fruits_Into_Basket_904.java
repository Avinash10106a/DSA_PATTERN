import java.util.HashMap;

public class Fruits_Into_Basket_904 {
    public static void main(String[] args) {

        int[] arr = {1,2,1};

        HashMap<Integer,Integer> hm = new HashMap<>();

        int low=0;
        int high=0;

        int maxLen=0;

        while(high<arr.length){
            hm.put(arr[high],hm.getOrDefault(arr[high],0)+1);

            while(hm.size()>2){
                hm.put(arr[low],hm.get(arr[low])-1);
                if(hm.get(arr[low])==0){
                    hm.remove(arr[low]);
                }
                low++;
            }
            maxLen = Math.max(maxLen, high - low + 1);
            high++;
        }

        System.out.println(maxLen);
    }
}
