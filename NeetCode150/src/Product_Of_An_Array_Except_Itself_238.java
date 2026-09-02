import java.util.Arrays;

public class Product_Of_An_Array_Except_Itself_238 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(ProductExceptSelf(nums)));
    }

    public static int[] ProductExceptSelf(int[] arr){
        int[] ans = new int[arr.length];

        ans[0] = 1;

        for(int i=1;i< arr.length;i++){
            ans[i]= arr[i-1]*ans[i-1];
        }

        int suffix =1;

        for(int i= arr.length-1;i>=0;i--){
            ans[i] *= suffix;
            suffix *= arr[i];
        }

        return ans;
    }
}
