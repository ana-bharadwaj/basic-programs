/*Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0 */

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class longestsubstring {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = input.nextLine();
        if (sentence == null || sentence.length() == 0) {
            System.out.println("0");
            System.exit(0);
        }
        Set<Character> a = new HashSet();
        char[] b = sentence.toCharArray();
        for (int i = 0; i < b.length; i++) {
            a.add(b[i]);
        }
        System.out.println(a);
        System.out.println(a.size());
    }


}
