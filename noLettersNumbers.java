public class noLettersNumbers{

    // One function to count BOTH letters and numbers using ASCII
    public static void countChars(char[] arr) {
        int letterCount = 0;
        int numberCount = 0;

        for (char c : arr) {
            int ascii = (int) c;   // type conversion

            // A-Z → 65–90
            // a-z → 97–122
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
                letterCount++;
            }
            // 0-9 → 48–57
            else if (ascii >= 48 && ascii <= 57) {
                numberCount++;
            }
        }

        System.out.println("Total Characters : " + letterCount);
        System.out.println("Total Numbers : " + numberCount);
    }

    public static void main(String[] args) {

        char[] arr1 = {'a', '2', 'c', 'm'};
        char[] arr2 = {'a', 's', 'c', 'm', 'k'};

        System.out.println("\nSample 1:");
        countChars(arr1);

        System.out.println("\nSample 2:");
        countChars(arr2);
        System.out.println("\nYakmi(25SP2180003)");
    }
}
