import java.util.Scanner;
class MCA {
    int[] arr = new int[5];
    // Method to initialize the array with user input
    void initialize(int[] input_Arr) {
         arr = input_Arr;
         }
    // Method to calculate the sum of all array elements
    int SumValue() {
        int result = 0;
        for(int i = 0; i < 5; i++) {
            result += arr[i];
        }
        return result;
    }
}
class MCA_Students{
    public static void main(String[] args) {
        MCA obj1 = new MCA(); // First object
        MCA obj2 = new MCA(); // second object
        int[] temp = new int[5];// Temporary array for first object
	   System.out.println("Name: T. Sachin Richard\nReg No.: 25SP2180005");
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i< 5; i++){
            temp[i] = sc.nextInt();
        }
        obj1.initialize(temp);// Initialize obj1 array

        int[] temp1 = new int[5];// Temporary array for second object


        for(int i =0 ; i< 5; i++){
            temp1[i] = sc.nextInt();
        }
       
        obj2.initialize(temp1);// Initialize obj2 array


	  // Displaying sum of elements of both objects
        System.out.println("Sum of obj1: "+ obj1.SumValue());
        System.out.println("Sum of obj2: "+ obj2.SumValue());


        sc.close();
    }
}
