/*Define the class with string dta member. Define the function setString() to get the string input.
  Define another another member function to find whether the string has minimum of two word, if so 
  return true,  else return false. Define the member function to convert the words in even position
  of the string to uppercase  and return the converted string back. The conversion has to takes place
  only when the strinf has a minimum of two words.  From the main method create the object for class. 
  Call the setString() to get the input. Call the String length validation. Call the String conversion
  function only when Strinf length validation returns true and display the converted string received from 
  function else display insuffiecient words in sentence.
  */
import java.util.Scanner;
class Word {
    String text;
    void setString() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter  a string: ");
         text  = sc.nextLine();

    }
    boolean minTwoWords() {
        int count = 0;
        for (char letter : text.toCharArray()) {
            if(letter == ' ') {
             count+= 2;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
    String convertWordUpper() {
        String result = new String();
        if (minTwoWords()) {
          for (char letter : text.toCharArray()) {
            int ascii = (int)letter;
            if(ascii >= 97 && ascii <= 122) {
                ascii -= 32;
            }
            result += (char)ascii;

          }
        }
        return result;
    }
}

class Sentence {
    public static void main(String[] args) {
        Word obj = new Word();
        obj.setString();
        if(obj.minTwoWords()) {
            System.out.println("The Uppercase string is : "+ obj.convertWordUpper());
        } else {
            System.out.println("Insufficient words in the sentence!");
        }

    }
}