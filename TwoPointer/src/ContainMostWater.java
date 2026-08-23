public class ContainMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};

        int ans =  totalWater(arr);
        System.out.println(ans);
    }

    public static int totalWater(int[] arr){
        int low=0;
        int high=arr.length-1;

        int maxWater = 0;

        while(low<high){
            int area = Math.min(arr[low],arr[high]) * (high-low);
            maxWater = Math.max(maxWater,area);
            if(arr[low]<arr[high]){
                low++;
            }else{
                high--;
            }
        }

        return maxWater;
    }
}
