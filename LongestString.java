//To find the longest word in given string
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;

        //Get a sentence from the user
        sentence =sc.nextLine();

        //Variables to keep track of the word and the longest word
        String current_word = new String();
        String longest_word = new String();

        for (int i = 0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);

            //Delimiter for word
            if (ch != ' ') {
                current_word += ch;
            } else {
                if (current_word.length() > longest_word.length()) {
                    longest_word = current_word;
                }
                current_word = ""; //Reset current word for the next word
            }

        }
        if (current_word.length() > longest_word.length()) {
            longest_word = current_word;
        }
        System.out.println("The longest word is: \""+longest_word+"\"");
    }
}