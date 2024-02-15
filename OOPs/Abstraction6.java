package OOPs;
public class Abstraction6 {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
    // Animal class ke andar walk() ka bas idea de diya
    // walk() ka implementation Horse aur Chicken class me hua hai
    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
