import java.util.Scanner;

public class pallindrone2 {
    public static void main(String[] args) {
        StringBuilder reverse = new StringBuilder();
        Scanner input = new Scanner(System.in);

        System.out.println("enter a sentence");

        // reverse the sentence then check if both the strings are the same

        try {
            String sentence = input.nextLine();
            char[] letter = sentence.toCharArray();
            for (int i = letter.length - 1; i >= 0; i--) {

                reverse.append(letter[i]);

            }

            if (sentence.equals(reverse.toString())) {
                System.out.println("its a palindrome ");
            } else {
                System.out.println("not a palindrom");
            }
        } finally {
            input.close();
        }

    }

}