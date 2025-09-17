package interfacedemo;

// Marker interface
interface Registerable {
    // No methods (marker interface)
}

// Student class implements marker interface
class Student implements Registerable {
    int id;
    String name;
    double fee;
    String course;

    public Student(int id, String name, double fee, String course) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.course = course;
    }
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Registerable s = new Student(102, "Neha", 12000.3, "Java");
        Registerable s1 = new Student(103, "Ramu", 13000, "Java");

        if (s instanceof Registerable) {
            System.out.println("Student is registered for this course");
        } else {
            System.out.println("Student is not registered for this course");
        }
    }
}
