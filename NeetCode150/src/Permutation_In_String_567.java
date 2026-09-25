public class Permutation_In_String_567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2){

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i=0;i<s1.length();i++){
            count1[s1.charAt(i)-'a']++;
            count2[s2.charAt(i)-'a']++;
        }

        int l = s1.length();

        for(int i=0;i<s2.length()-l;i++){
            if(matches(count1,count2)) return true;

            count2[s2.charAt(i+l)-'a']++;
            count2[s2.charAt(i)-'a']--;
        }

        return matches(count1,count2);
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
