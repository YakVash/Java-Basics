//Program using single inheritance
class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("Name: "+name+"  Age: "+age);
    }
}

class Student extends Person {
    String course;
    void displayStudent() {
        System.out.println("Course: "+course);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student S = new Student();
        S.name = "Alice";
        S.age = 20;
        S.course = "COS";
        S.displayPerson();
        S.displayStudent();
    }
}