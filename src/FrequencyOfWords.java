/**
 * Find the frequency of the words existing in a given string
 * <p>
 * Example 1:
 * string s = " My name is foo"
 * output:
 * My : 1
 * name : 1
 * is : 1
 * foo : 1
 * <p>
 * Example 2:
 * string s = "I love coding because coding is cool and coding is great"
 * I : 1
 * love : 1
 * coding : 3
 * because : 1
 * is : 2
 * cool : 1
 * and : 1
 * great : 1
 */

import java.util.HashMap;

public class FrequencyOfWords {
    public static void main(String[] args) {
        FrequencyOfWords freq = new FrequencyOfWords();
        freq.CountWords("My name is foo");
        freq.CountWords("I love coding because coding is cool and coding is great");
    }

    public void CountWords(String s) {
        String[] words = s.split("\\s");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String w : words) {

            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                int ke = map.get(w);
                map.put(w, ke + 1);
            }

        }
        System.out.println(map);
    }
}



