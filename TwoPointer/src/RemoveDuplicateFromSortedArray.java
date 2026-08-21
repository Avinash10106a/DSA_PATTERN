public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
    }


    //Maintain Only Distinct Elements 
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

       int i=0;

        for(int j=1;j< arr.length;j++){

            if(arr[i] != arr[j]){
               arr[++i]=arr[j];
            }
        }

        return i+1;
    }

    

    //Maintaing the All Elements of an Array 
    public static int removeDuplicateEle(int[] nums){
        int i=0;
        int j=1;
        int count=0;

        while(j<nums.length){
            if(nums[i]!=nums[j]){
                i++;
                count++;
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }

            j++;
        }

        return count+1;
    }
}


//Write a program to find k greatest element in array