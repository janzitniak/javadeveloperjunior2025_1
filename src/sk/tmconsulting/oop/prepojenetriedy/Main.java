package sk.tmconsulting.oop.prepojenetriedy;

public class Main {
    public static void main(String[] args) {
        Address adresa = new Address("Nitra", "Fraňa Mojtu 12");
        Person osoba = new Person("Ján Novák", adresa);

        osoba.printInfo();
    }
}

