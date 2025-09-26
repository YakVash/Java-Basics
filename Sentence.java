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