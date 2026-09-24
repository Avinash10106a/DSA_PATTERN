import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String_438 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s,p));
    }

    public static List<Integer> findAnagrams(String s, String p) {

        if(s.length()<p.length()) return new ArrayList<>();

        List<Integer> ls = new ArrayList<>();

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i=0;i<p.length();i++){
            count1[p.charAt(i)-'a']++;
        }

        int len = p.length();

        //First Window
        for(int i=0;i<len;i++){
            count2[s.charAt(i)-'a']++;
        }

        if(matches(count1,count2)){
            ls.add(0);
        }

        //Next Window
        for(int i=len;i<s.length();i++){

            count2[s.charAt(i)-'a']++;
            count2[s.charAt(i-len)-'a']--;

            if(matches(count1,count2)){
                ls.add(i-len+1);
            }
        }

        return ls;
    }

    private static boolean matches(int[] arr1 , int[] arr2){

        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }
}
