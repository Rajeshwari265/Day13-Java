package oopsconcept;
class Students {
    String name;

    Students(String name) {
        this.name = name;
        System.out.println("the object is created");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Students s = new Students("Raji");
        Students s1 = new Students("dharshini");
        System.out.println(s.name);
        System.out.println(s1.name);
    }
}
    

