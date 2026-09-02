public class Valid_Anagram_242 {
    public static void main(String[] args) {
        String s="gross";
        String t = "sores";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int n: count){
            if(n!=0) return false;
        }

        return true;
    }
}
