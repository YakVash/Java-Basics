//Sum of digits in the given number until it is reduced to a single digit
import java.util.Scanner;
public class SumDigits {
    public static void main (String[] args) {
        int num, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: T. Sachin Richard\nReg No.: 25SP2160005");
        System.out.println("Input: ");
        num = sc.nextInt();

        //Repeat until number reduced to single digit
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                rem = num % 10;
                sum += rem;
                num /= 10;
            }
            //update num with sum of digits
            num = sum;

        }
        System.out.println("SUM: "+num);//Display final single digit
        System.out.println("Yakmi(25SP2180003)");
    }
}