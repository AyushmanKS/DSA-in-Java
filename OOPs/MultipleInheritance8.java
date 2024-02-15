package OOPs;

public class MultipleInheritance8 {
    public static void main(String args[]) {
        Bear b = new Bear();
        b.veg();
        b.meat();
    }
}

interface Herbivore {
    void veg();
}
interface Carnivore {
    void meat();
}

class Bear implements Herbivore, Carnivore {
    public void veg() {
        System.out.println("Bear is a Herbivore");
    }
    public void meat() {
        System.out.println("Bear is a Carnivore");
    }
}
