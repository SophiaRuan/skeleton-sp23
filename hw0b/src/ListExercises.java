import java.util.List;
import java.util.ArrayList;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        if (L.isEmpty()) {
            return 0;
        } else {
            int result = 0;
            for (int i : L) {
                result += i;
            }
            return result;
        }
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> result = new ArrayList<>();
        for (int item : L) {
            if (item % 2 == 0) {
                result.add(item);
            }
        }
        return result;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i < L1.size(); i++) {
            if (L2.contains(L1.get(i))) {
                result.add(L1.get(i));
            }
        }
        return result;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int result = 0;
        for (String w : words) {
            for (int i=0; i <w.length(); i++) {
                if (w.charAt(i)==c) {
                    result++;
                }
            }
        }
        return result;
    }
}
