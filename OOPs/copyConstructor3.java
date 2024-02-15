package OOPs;
public class copyConstructor3 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ayushman";
        s1.roll = 8;
        s1.password = "abcd";

        // Creating a new Student using the copy constructor
        //Student s2 = new Student(s1);
    }
}

class Student {
    String name;
    int roll;
    String password;

    // Default constructor
    Student() {
        System.out.println("Default constructor is called...");
        System.out.println("name: " + name + "\nroll: " + roll + "\npassword: " + password);
    }

    // Copy constructor
    Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.password = other.password;

        System.out.println("Copy constructor is called...");
        System.out.println("name: " + name + "\nroll: " + roll + "\npassword: " + password);
    }
}
