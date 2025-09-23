/* The 2 students are having two sets of balls which are red and blue. 
If the total number of balls are greater than 50 for each 10 balls they will be getting 2 points. 
If the total count is less than 50 for each 10 balls they will be getting 1 point. 
Find the points. */
import java.util.Scanner;
public class CountPoints {
    public static int CalculatePoints(int total_balls) {
        int points;
        if(total_balls>50) {
            return (total_balls/10)*2;
        } else {
            return (total_balls/10)*1;
        }
        

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of balls of Student 1 : ");
        int ball_num1 = sc.nextInt();
        System.out.println("Enter the number of balls of Student 2: ");
        int ball_num2 = sc.nextInt();
        
        System.out.println("Total number of points of Student 1: "+ CalculatePoints(ball_num1));
        System.out.println("Total number of points of Student 2: "+ CalculatePoints(ball_num2));

        sc.close();

    }
}