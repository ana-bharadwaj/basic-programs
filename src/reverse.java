import java.util.Scanner;

public class reverse {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");
        String word = input.nextLine();
      //converting to char
        char[] letter = word.toCharArray();
        for (int i = letter.length - 1; i >= 0; i=i-1)
            System.out.print(letter[i]);
    }

    }

