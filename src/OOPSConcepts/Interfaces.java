package OOPSConcepts;

interface Animals {
    void walk();
}

interface Herbivore {
    void eats();
}

class Dog implements Animals, Herbivore {
    public void walk() {
        System.out.println("Dog Walks on 4 legs");
    }
    public void eats() {
        System.out.println("Dog eats only biscuits");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.walk();
        dog.eats();
    }
}
