//Remove a given element from array and display the resulted array by shifting the remaining elements to left 
import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args) {
       int i;
       Scanner sc = new Scanner(System.in);
       char[] arr = {'a', 's', 'm', 'c'};
       int n = arr.length;
       System.out.println("Name: T. Sachin Richard\nReg No.: 25SP2160005");
       for (i=0; i < n; i++) {
        System.out.print("'"+arr[i]+"'");
       }

       //Get element to remove from user
       System.out.print("\n Given letter to be removed: ");
       char key = sc.next().charAt(0);

       //Search for the position of the given element
       int pos = -1;
       for ( i = 0; i < n; i++) {
        if (arr[i] == key) {
            pos = i;
        }
       }
       if (pos == -1) {
        System.out.println("Element not found!");
       } else {
        //Shift element to left to overwrite found element
        for (i = pos; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        n--;
        for (i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
       }
       System.out.println("\nYakmi(25SP2180003)");

    }
}