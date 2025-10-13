//Program using Multilevel Inheritance
class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("Name: "+name+"  Age: "+age);

    }
}

class Student extends Person {
    String rollno;
    void displayStudent() {
        System.out.println("Rollno: "+rollno);
    }
}

class Exam extends Student {
    int marks;
    void displayExam() {
        System.out.println("Marks: "+marks);
    }
}

public class multiLevelExample {
    public static void main(String[] args) {
        Exam e = new Exam();
        e.name = "Bob";
        e.age = 20;
        e.rollno = "S101";
        e.marks = 95;
        e.displayPerson();
        e.displayStudent();
        e.displayExam();
        
    }
}