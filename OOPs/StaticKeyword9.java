package OOPs;

public class StaticKeyword9 {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.SchoolName = "Swaraj India";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);
    }
}

class Student {
    String name; int roll;

    static String SchoolName;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
