/**
 * Valid Anagram
 *
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Constraints:
 *
 *     1 <= s.length, t.length <= 5 * 104
 *     s and t consist of lowercase English letters.
 */



import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
        System.out.println(validAnagram.isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> Set1 = new HashMap();
        HashMap<Character, Integer> Set2 = new HashMap();
        char[] LoS = s.toCharArray();
        char[] LoT = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            Set1.put(LoS[i], 0);
            if (Set1.containsKey(LoS[i])) {
                Set1.put(LoS[i], Set1.get(LoS[i]) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            Set2.put(LoT[i], 0);
            if (Set2.containsKey(LoT[i])) {
                Set2.put(LoS[i], Set2.get(LoT[i]) + 1);
            }

        }
        if (Set1.equals(Set2)) {
            return true;
        }
        else {
            return false;
        }
    }
}
