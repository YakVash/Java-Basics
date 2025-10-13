interface Sports {
    void play();
}

interface Studies {
    void study();
}

class Student implements Sports, Studies {
    String name;
    public void play() {
        System.out.println(name+" is playing football");
    }
    public void study() {
        System.out.println(name+ " is Studying.");
    }
}

public class Interface {
    public static void main(String [] args) {
        Student S = new Student();
        S.name = "Bob";
        S.play();
        S.study();
    }
}