import java.util.HashSet;

public class Duplicate_Contains_217 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(duplicatesExist(arr));
    }

    public static boolean duplicatesExist ( int[] arr){

        HashSet<Integer> hs = new HashSet<>();

        for (int n : arr) {
            if (hs.contains(n)) {
                return true ;
            }

            hs.add(n);
        }

        return false;
    }
}