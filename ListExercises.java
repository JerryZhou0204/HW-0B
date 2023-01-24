import java.util.List;
import java.util.ArrayList;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum=0;
        for(Integer i : L) {
            sum = sum + i;
        }
        return sum;

    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> lst= new ArrayList<>();
        for(Integer i: L){
            if (i%2==0) lst.add(i);
        }
        return lst;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> lst= new ArrayList<>();
        for(Integer i: L1){
            for(Integer j: L2){
                if (i.equals(j)){
                    lst.add(i);
                }
            }
        }
        return lst;
    }

    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        String ch= Character.toString(c);
        int count=0;
        for(int i=0; i<words.size();i++){
            for (int j=0; j<words.get(i).length();j++){
                if (words.get(i).substring(j,j+1).equals(ch)) {
                    count++;
                }
            }
        }
        return count;
    }
}
