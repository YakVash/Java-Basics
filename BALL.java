import java.util.Scanner;

public class BallPoints {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of red balls: ");
        int red = sc.nextInt();

        System.out.print("Enter number of blue balls: ");
        int blue = sc.nextInt();

        // Total balls
        int total = red + blue;

        // Number of 10-ball groups
        int groups = total / 10;

        int points;

        // Condition to decide points
        if (total > 50) {
            points = groups * 2;
        } else {
            points = groups * 1;
        }

        // Output
        System.out.println("Total Balls: " + total);
        System.out.println("Points Earned: " + points);
    }
}
