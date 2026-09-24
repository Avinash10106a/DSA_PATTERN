import java.util.HashMap;

public class Minimum_Window_SubString_76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s,t));
    }

    public static String minWindow(String s,String t){

        if(s.length()<t.length()) return "";

        HashMap<Character,Integer> hm = new HashMap<>();

        for(char ch : t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }


        int low=0;
        int high=0;

        int count=t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while(high<s.length()){

            char ch = s.charAt(high);

            if(hm.containsKey(ch)){

                if(hm.get(ch)>0){
                    count--;
                }

                hm.put(ch,hm.getOrDefault(ch,0)-1);
            }


            while(count == 0){

                if(high-low+1<minLen){
                    minLen=high-low+1;
                    start = low;
                }


                char left = s.charAt(low);

                if(hm.containsKey(left)){

                    hm.put(left, hm.get(left) + 1);

                    if(hm.get(left) > 0) {
                        count++;
                    }
                }

                low++;
            }

            high++;
        }

        return minLen == Integer.MAX_VALUE ? "": s.substring(start,start+minLen);
    }
}
