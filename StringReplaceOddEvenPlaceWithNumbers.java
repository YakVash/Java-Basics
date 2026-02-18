import java.util.Scanner;
class StringReplaceOddEvenPlaceWithNumbers {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String st = new String();
        System.out.println("Enter A string: ");
        st = sc.nextLine();
        for (int i; i < st.length(); i++) {
            if (st.length() % 2 == 0) {
            
                st.charAt(i+1) = i+2; 
            }
            else 
            {
                st.charAt(2*i) = i+1;
            }
        }

        System.out.println(st);


    }
}