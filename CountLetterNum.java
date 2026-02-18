//To count the number of letters in a given array of characters and Numbers
import java.util.Scanner;
public class CountLetterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int char_count = 0;
        int num_count = 0;
        System.out.println("Name: T. Sachin Richard\nReg No.: 25SP2180005");
        char[] arr = sc.nextLine().toCharArray();
        for( int i = 0; i<arr.length; i++) {
            
            int ascii = (int)arr[i];
            //Check if the char is letter
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
                char_count++;
            } else if (ascii >= 47 && ascii <= 58) {//Check if the character is digit
                num_count++;
            }
            
        }

        
        System.out.println ("\nTotal Characters :"+char_count+"\nTotal Numbers: "+num_count);
        
    }
}