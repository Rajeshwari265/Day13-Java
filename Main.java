package oopsconcept;
class Student {
    String name;
    int age;
    int rollNo;
    String department;
    void study() {
        System.out.println(name + " is studying");
        System.out.println(age + " is the age of " + name);
        
    }
    void exam() {
        System.out.println(name + " is Writing the exam");
    }
}
public class Main {
     public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rajeshwari";
        int age=20;
        s1.age = age;

        s1.study();
        Student s2 = new Student();
        s2.name = "Ramesh";
        s2.exam();
    }
}