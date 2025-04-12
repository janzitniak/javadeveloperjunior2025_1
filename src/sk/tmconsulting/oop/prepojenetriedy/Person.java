package sk.tmconsulting.oop.prepojenetriedy;

public class Person {
    private String name;
    private Address address;  // prepojenie na inú triedu

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void printInfo() {
        System.out.println("Meno: " + name);
        System.out.println("Adresa: " + address.getFullAddress());
    }
}
