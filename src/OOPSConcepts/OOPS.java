package OOPSConcepts;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student() {
        System.out.println("This is the non-parameterised constructor");
    }

    // Parameterised Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s3) {
        this.name = s3.name;
        this.age =  s3.age;
    }
}

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kasim";
        s1.age = 23;
        s1.printInfo();

        Student s2 = new Student("Samar", 20);
        s2.printInfo();

        Student s3 = new Student(s1);
        s3.printInfo();
    }
}
