public class Permutation_In_String_567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {

            if (s1.length() > s2.length()) {
                return false;
            }

            int[] count1 = new int[26];
            int[] count2 = new int[26];

            // Frequency of s1
            for (char ch : s1.toCharArray()) {
                count1[ch - 'a']++;
            }

            int window = s1.length();

            // First window
            for (int i = 0; i < window; i++) {
                count2[s2.charAt(i) - 'a']++;
            }

            if (matches(count1, count2)) {
                return true;
            }

            // Sliding window
            for (int i = window; i < s2.length(); i++) {

                // Add new character
                count2[s2.charAt(i) - 'a']++;

                // Remove old character
                count2[s2.charAt(i - window) - 'a']--;

                if (matches(count1, count2)) {
                    return true;
                }
            }

            return false;
        }

        private static boolean matches(int[] a, int[] b) {
            for (int i = 0; i < 26; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
            return true;
        }
}
