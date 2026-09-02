public class Valid_Palindrome_125 {
    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        String t="race a car";



        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(t));
    }

    public static boolean isPalindrome(String s){
        String str = s.toLowerCase();

        int low=0;
        int high = str.length()-1;

        while(low<high){

            if(!Character.isLetterOrDigit(str.charAt(low))){
                low++;
                continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(high))){
                high--;
                continue;
            }

            if(str.charAt(low) != str.charAt(high)) return false;
            low++;
            high--;
        }

        return true;
    }
}
