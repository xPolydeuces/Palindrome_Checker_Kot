import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// This app checks if string inputted by user is a palindrome or not.
        Scanner myScan = new Scanner(System.in);
        System.out.print("Input the word to check: ");
        String word = myScan.nextLine();
        String revWord = new StringBuffer(word).reverse().toString();

        if(word.equalsIgnoreCase(revWord))
        {
            System.out.println("Word '" + word + "' is a palindrome.");
        }
        else
        {
            System.out.println("Word " + word + " is NOT a palindrome.");
        }
    }
}
