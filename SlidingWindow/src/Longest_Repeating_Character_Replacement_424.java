public class Longest_Repeating_Character_Replacement_424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k=1;

        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String str,int k){

        int[] count = new int[26];

        int low=0;
        int high=0;

        int res = Integer.MIN_VALUE;

        while(high<str.length()){

            count[str.charAt(high)-'A']++;

            int len = high-low+1;
            int maxFreq = MaxEle(count);

            int diff = len - maxFreq;

            while(diff>k){
                count[str.charAt(low)-'A']--;
                low++;

                len = high-low+1;
                maxFreq = MaxEle(count);

                diff = len - maxFreq;
            }
//            len = high-low+1;
            res = Math.max(res,len);
            high++;
        }
        return res;
    }

    public static int MaxEle(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int n : arr){
            max = Math.max(max,n);
        }
        return max;
    }
}
