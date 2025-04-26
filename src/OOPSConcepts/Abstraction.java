package OOPSConcepts;

abstract class Animal {
    abstract void Walk();
    Animal() {
        System.out.println("you are creating a new animal");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a horse");
    }
    void Walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    void Walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
    }
}
