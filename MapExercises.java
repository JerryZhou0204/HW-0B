import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<26; i++){
            int asc = i+97;
            map.put((char)asc, i+1);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer num:nums){
            int square = num.intValue()*num.intValue();
            map.put(num,square);
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String word:words){
            if(!map.containsKey(word)) {
                map.put(word, 1);
            }
            else{
                map.put(word,map.get(word)+1);}
        }

        return map;
    }
}
