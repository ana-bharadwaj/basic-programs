
/**
 * Find the number of times the words of string A occur in String B
 * <p>
 * Input:
 * String a = "My name is foo"
 * String b = "My passtime is foo and my pet is foo and it is the best"
 * Output:
 * foo -> 2
 * name -> 0
 * is -> 3
 * My -> 1
 * <p>
 * Make sure that the Output is in the same format os shown above
 */

import java.util.HashMap;
import java.util.Map;

public class FreqOfWords2 {
    public static void main(String[] args) {
        FreqOfWords2 freq = new FreqOfWords2();
        freq.CountWords("as bat hat js", "as hat bat gsg asd bat hat");
    }

    public void CountWords(String a, String b) {
        String[] s1 = a.split("\\s");
        String[] s2 = b.split("\\s");
        HashMap<String, Integer> map = new HashMap<String, Integer>();


        for (String word : s1) {

                map.put(word, 0);

        }
        for (String s2word : s2) {
            if (map.containsKey(s2word)) {
                map.put(s2word, map.get(s2word) + 1);
            }

        }
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}


