package OOPs;
public class Constructors2 {
    public static void main(String args[]) {
        Student s1 = new Student("Ayushman");
        System.out.println(s1.name);
    }
}

class Student {
    String name; int roll;
    
    // Constructor
    Student (String name) {
        System.out.println("Constructor is called...");
        this.name = name;
    }
}
