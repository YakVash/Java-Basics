class ConstructorStaticMethodStaticBlock {
    static int totalStudents;
    String name;

    static {
        totalStudents = 100;
        System.out.println("University System initialized! Start count = "+totalStudents);
    }

    ConstructorStaticMethodStaticBlock(String name) {
        this.name = name;
        totalStudents++;
        System.out.println("New Student admitted: "+name);
    }

    static void showTotalStudents() {
        System.out.println("Total Students in university: "+totalStudents);

    }

    public static void main(String [] args) {
        System.out.println("Main Method starts...");
        ConstructorStaticMethodStaticBlock.showTotalStudents();
        ConstructorStaticMethodStaticBlock S1 = new ConstructorStaticMethodStaticBlock("Alice");
        ConstructorStaticMethodStaticBlock S2 = new ConstructorStaticMethodStaticBlock("Bob");
        ConstructorStaticMethodStaticBlock.showTotalStudents();
    }
}