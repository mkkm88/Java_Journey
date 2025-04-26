package OOPSConcepts;

interface Animals {
    public void walk();
}

class Dog implements Animals {
    public void walk() {
        System.out.println("Dog Walks on 4 legs");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
    }
}
