//To count the number of letters in a given array of characters and Numbers
public class CountLetterNum {
    public static void main(String[] args) {
        int char_count = 0;
        int num_count = 0;
        char[] arr = {'a', 'c', '2', 'd'};
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