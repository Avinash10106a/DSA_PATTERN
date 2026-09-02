import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagram_49 {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ls = groupAnagram(str);

        for(List<String> l: ls){
            System.out.print(l + " ");
        }
    }

    public static List<List<String>> groupAnagram(String[] str){

        int[] count = new int[26];

        HashMap<String,List<String>> hm = new HashMap<>();

        for(String s : str){
            Arrays.fill(count,0);

            for(int i=0;i<s.length();i++){
                count[s.charAt(i)-'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int n : count){
                sb.append('#');
                sb.append(n);
            }

            String key = sb.toString();

            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }


            hm.get(key).add(s);
        }

        List<List<String>> ls= new ArrayList<>();

        for(String key : hm.keySet()){
            ls.add(hm.get(key));
        }

        return ls;

    }
}
