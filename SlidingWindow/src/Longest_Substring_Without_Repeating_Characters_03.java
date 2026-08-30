import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_03 {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int low=0;
        int high=0;

        HashSet<Character> hs = new HashSet<>();

        int len=-1;

        while(high<s.length()){
            char ch = s.charAt(high);

            while(hs.contains(ch)){
                hs.remove(s.charAt(low));
                low++;
            }

            hs.add(ch);

            len = Math.max(len,high-low+1);
            high++;
        }

        System.out.println(len);
    }
}
