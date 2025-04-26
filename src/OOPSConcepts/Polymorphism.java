package OOPSConcepts;

class Car {
    String name;
    int price;

    public void printCarInfo(String name) {
        System.out.println(name);
    }

    public void printCarInfo(int price) {
        System.out.println(price);
    }

    public void printCarInfo(String name, int price) {
        System.out.println(STR."\{name} \{price}");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.name = "Audi";
        myCar.price = 1200000;

        myCar.printCarInfo(myCar.name, myCar.price);
    }
}
