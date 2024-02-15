package OOPs;
public class MethodOverriding5 {
    public static void main(String args[]) {
        
        Deer obj = new Deer();
        // Method Overriding
        // eats function is calld but it will only invoke child class eats() 
        // but not parent class eats()
        obj.eats();
    }
}
class Animal {
    void eats() {
        System.out.println("Parent class eats called...");
    }
}
class Deer extends Animal {
    void eats() {
        System.out.println("Child class eats called...");
    }
}
