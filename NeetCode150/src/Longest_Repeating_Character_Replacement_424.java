public class Longest_Repeating_Character_Replacement_424 {
    public static void main(String[] args) {
        String s = "ABABA";
        int k=2;

        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k){
        int occurence[] = new int[26];

        int low=0;
        int high=0;

        int mostOccurence = 0;
        int ans=Integer.MIN_VALUE;


        while(high<s.length()){
            mostOccurence = Math.max(mostOccurence,++occurence[s.charAt(high)-'A']);

            if(high-low+1-mostOccurence > k){
                occurence[s.charAt(low)-'A']--;
                low++;
            }

            ans = Math.max(ans,high-low+1);
            high++;
        }

        return ans==Integer.MIN_VALUE ? 0:ans;
    }
}
