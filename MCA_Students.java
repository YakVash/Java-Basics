/* Write a program to define a class MCA with one array data member of size 5 and
the member function to initialize the array data member by receiving array as formal 
parameter. 
One more member function sum of values to add the values of array data members using 
for extended loop and return the result back.
In the main method define two objects for the class and assign balues for objects using 
member functions and calculate the summation */

import java.util.Scanner;
class MCA {
    int[] arr = new int[5];
    void initialize(int[] input_Arr) {
         arr = input_Arr;
         }
    
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
        MCA obj1 = new MCA();
        MCA obj2 = new MCA();
        int[] temp = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i< 5; i++){
            temp[i] = sc.nextInt();
        }
        obj1.initialize(temp);
        int[] temp1 = new int[5];
        for(int i =0 ; i< 5; i++){
            temp1[i] = sc.nextInt();
        }
        
        obj2.initialize(temp1);

        System.out.println("Sum of obj1: "+ obj1.SumValue());
        System.out.println("Sum of obj2: "+ obj2.SumValue());

        sc.close();
    }
} 