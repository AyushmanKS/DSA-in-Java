package OOPs;
public class Inheritance4 {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        babyFish fish = new babyFish();
        fish.breathe();
    }
}
// Base/Parent Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void breathe() {
        System.out.println("Breathes");
    }
}

// Derived Class/  Single level inheritance
// Animal-->Fish
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

// Multi level inheritance:    Animal-->Fish-->babyFish
class babyFish extends Fish {
    int smallFins;

    void smallFins() {
        System.out.println("Small fins called...");
    }
}
