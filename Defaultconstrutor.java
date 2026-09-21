package oopsconcept;
class Students {
    String name;

        Students() {
            
            System.out.println("Default constructor");
        }

    Students(String name) {
        this.name = name;
        System.out.println("the object is created");
    }
}

public class Defaultconstrutor {
    public static void main(String[] args) {
        Students s = new Students();
        Students s1 = new Students("dharshini");
        System.out.println(s.name);
        System.out.println(s1.name);
    }
}
    

