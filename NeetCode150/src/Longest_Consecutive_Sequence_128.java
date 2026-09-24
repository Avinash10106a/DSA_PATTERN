import java.util.HashSet;

public class Longest_Consecutive_Sequence_128 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] arr){

        if(arr.length==0) return 0;

        HashSet<Integer> hs = new HashSet<>();  //Store to check the first Element of Sequence

        for(int n: arr){
            hs.add(n);
        }

        int res=0;

        for(int n:hs){ //Iterate over the HashSet Becasue Array may contains duplicates

            if(hs.contains(n-1)){ //If Previous one Exist than Current one is not the first element
                continue;
            }else{
                int currNum = n; //Found the First Element of the Sequence
                int currSeq = 0;

                while(hs.contains(currNum)){  //Than start finding the longest Sequence
                    System.out.println(currNum);
                    currNum++;
                    currSeq++;
                }

                res = Math.max(res,currSeq); //Storing the Maximum len of Sequence
            }
        }

        return res;
    }

}
