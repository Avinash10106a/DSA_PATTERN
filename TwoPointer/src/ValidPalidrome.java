public class ValidPalidrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalidrome(str));
    }

    public static boolean isPalidrome(String s){
        String str = s.toLowerCase();

        int low=0;
        int high=str.length()-1;

        while(low<high){
            if(!Character.isLetter(str.charAt(low))){
                low++;
                continue;
            }
            if(!Character.isLetter(str.charAt(high))){
                high--;
                continue;
            }

            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}
