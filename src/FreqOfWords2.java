 /**
 * Find the number of times the words of string A occur in String B
 * 
 * Input: 
 * String a = "My name is foo"
 * String b = "My passtime is foo and my pet is foo and it is the best"
 * Output: 
 * foo -> 2
 * name -> 0
 * is -> 3
 * My -> 1
 * 
 * Make sure that the Output is in the same format os shown above
 */

public class FreqOfWords2 {
    public static void main(String[] args) {
        FreqOfWords2 freq = new FreqOfWords2();
        freq.CountWords("My name is foo", "My passtime is foo and my pet is foo and it is the best");
    }

    public void CountWords(String a, String b) {
        // Your code goes here...

    }
}