//Demonstrating some string methods
class StringMethods {
    public static void main(String [] args) {
        String Ob1 = "First String";
        String Ob2 = "Second String";
        String Ob3 = Ob1;

        System.out.println("The First String is : "+Ob1);
        System.out.println("The Second String is : "+Ob2);

        System.out.println("Length of Ob1: "+Ob1.length());

        System.out.println("Character at index 3 of Ob1: "+ Ob1.charAt(3));

        if (Ob1.equals(Ob2)) {
            System.out.println("Ob1 == Ob2");
        }
        else {
            System.out.println("Ob1 != Ob2");
        }

        if (Ob1.equals(Ob3)) {
            System.out.println("Ob1 == Ob3");
        }
        else {
            System.out.println("Ob1 != Ob3");
        }
    }
}