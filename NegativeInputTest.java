/* 
A program to handle negative input using a user-defined exception.
If the user enters a negative number, the program throws and catches the exception.
*/

// User-defined exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);  // pass message to Exception class
    }
}

public class NegativeInputTest {

    // Method to check number and throw exception
    static void checkNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Negative number entered: " + num);
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Name: T. Sachin Richard\nReg No.: 25SP2160005");
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            checkNumber(n);  // May throw exception

        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
         
    }
}
