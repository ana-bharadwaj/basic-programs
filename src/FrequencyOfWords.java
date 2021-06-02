/**
 * Find the frequency of the words existing in a given string
 *
 * Example 1:
 * string s = " My name is foo"
 * output:
 *      My : 1
 *      name : 1
 *      is : 1
 *      foo : 1
 *
 * Example 2:
 * string s = "I love coding because coding is cool and coding is great"
 *      I : 1
 *      love : 1
 *      coding : 3
 *      because : 1
 *      is : 2
 *      cool : 1
 *      and : 1
 *      great : 1
 */

public class FrequencyOfWords {
    public static void main(String[] args) {
        FrequencyOfWords freq = new FrequencyOfWords();
        freq.CountWords("My name is foo");
        freq.CountWords("I love coding because coding is cool and coding is great");
    }

    public void CountWords(String s){
        // Your code goes here
    }

}
