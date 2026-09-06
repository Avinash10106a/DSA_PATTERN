import java.util.HashMap;

public class Longest_Substring_With_K_Unique_GFG {
    public static void main(String[] args) {
        String s = "aabacbebebe";

        int k=2;

        System.out.println(longestKSubstr(s,k));

    }

    public static int longestKSubstr(String s, int k) {

        HashMap<Character,Integer> hm = new HashMap<>();

        int low=0;
        int high=0;

        int len=-1;

        while(high<s.length()){
            char c = s.charAt(high);
            hm.put(c,hm.getOrDefault(c,0)+1);

            while(hm.size()>k){
                hm.put(s.charAt(low),hm.getOrDefault(s.charAt(low),0)-1);

                if(hm.get(s.charAt(low))==0){
                    hm.remove(s.charAt(low));
                }
                low++;
            }

            len = Math.max(len,high-low+1);
            high++;
        }

        if(hm.size()<k) return -1;

        return len;

    }
}
