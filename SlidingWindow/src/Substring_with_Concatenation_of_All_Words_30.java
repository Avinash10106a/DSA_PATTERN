import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Substring_with_Concatenation_of_All_Words_30 {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        System.out.println(findSubstring(s,words));
    }

    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> ans = new ArrayList<>();

        if (words.length == 0) return ans;

        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;

        if (s.length() < totalLen) return ans;

        HashMap<String, Integer> required = new HashMap<>();

        for (String word : words) {
            required.put(word, required.getOrDefault(word, 0) + 1);
        }

        // There are wordLen possible starting offsets
        for (int offset = 0; offset < wordLen; offset++) {

            int left = offset;
            int count = 0;

            HashMap<String, Integer> window = new HashMap<>();

            for (int right = offset;
                 right + wordLen <= s.length();
                 right += wordLen) {

                String word = s.substring(right, right + wordLen);

                // Word is not required
                if (!required.containsKey(word)) {
                    window.clear();
                    count = 0;
                    left = right + wordLen;
                    continue;
                }

                window.put(
                        word,
                        window.getOrDefault(word, 0) + 1
                );

                count++;

                // Too many copies of this word
                while (window.get(word) > required.get(word)) {

                    String leftWord = s.substring(
                            left,
                            left + wordLen
                    );

                    window.put(
                            leftWord,
                            window.get(leftWord) - 1
                    );

                    left += wordLen;
                    count--;
                }

                // All words matched
                if (count == words.length) {
                    ans.add(left);

                    String leftWord = s.substring(
                            left,
                            left + wordLen
                    );

                    window.put(
                            leftWord,
                            window.get(leftWord) - 1
                    );

                    left += wordLen;
                    count--;
                }
            }
        }

        return ans;
    }
}
