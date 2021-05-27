import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    System.out.println("enter a word");
    String word = Input.nextLine();
    // converting to character
    char[] letter = word.toCharArray();
    for (int i = letter.length - 1; i >= 0; i = i - 1)
      System.out.print(letter[i]);
  }

}
