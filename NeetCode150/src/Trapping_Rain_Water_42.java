import java.sql.SQLOutput;
import java.util.Arrays;

public class Trapping_Rain_Water_42 {
    public static void main(String[] args) {
        int[] heights = {4,2,0,3,2,5};

        System.out.println(trap2(heights));
    }

    public static int trap(int[] heights){
        int n=heights.length-1;

        int left=0;
        int right=n;

        int maxLeft=0;
        int maxRight=heights[right];

        int totalWater = 0;

        while(left<right){

            if(heights[left]<heights[right]){
                if(maxLeft<=heights[left]){
                    maxLeft = heights[left];
                }else{
                    totalWater += maxLeft-heights[left];
                }
                left++;
            }else{

                if(maxRight<=heights[right]){
                    maxRight = heights[right];
                }else{
                    totalWater += maxRight-heights[right];
                }
                right--;
            }
        }
        return totalWater;
    }

    //Another Way to Solving Same Problem

    public static int trap2(int[] height){
        int n=height.length;

        int left=0;
        int right=n-1;

        int leftMax=0;
        int rightMax=height[n-1];

        int totalWater = 0;

        while(left<right){

            if(height[left]<height[right]){

                leftMax=Math.max(leftMax,height[left]);

                if(leftMax-height[left]>0){
                    totalWater += leftMax-height[left];
                }

                left++;
            }else{

                rightMax=Math.max(rightMax,height[right]);

                if(rightMax-height[right]>0){
                    totalWater += rightMax-height[right];
                }

                right--;
            }
        }

        return totalWater;
    }


    //In following We used Extra Space

    public static int trap3(int[] heights){
        int n=heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = heights[0];

        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],heights[i]);
        }
        right[n-1] = heights[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],heights[i]);
        }

        int totalWater = 0;

        for(int i=0;i<n;i++){
            totalWater += Math.min(left[i],right[i])-heights[i];
        }

        return totalWater;
    }
}
