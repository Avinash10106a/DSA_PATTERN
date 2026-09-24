import java.util.HashSet;

public class Longest_Substring_WithOut_Repeating_Character_03 {
    public static void main(String[] args) {

        String s = "abcabcbb";

        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s){
        
        HashSet<Character> hs = new HashSet<>();

        int low=0;
        int high=0;

        int ans=0;

        while(high<s.length()){

            char ch = s.charAt(high);

            while(hs.contains(ch)){
                hs.remove(s.charAt(low));
                low++;
            }

            hs.add(ch);

            ans = Math.max(ans,high-low+1);

            high++;
        }

        return ans;
    }
}
