package sk.tmconsulting.gui.prepojenetriedy;

// Person.java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return "Meno: " + name + "\nVek: " + age + " rokov";
    }
}

