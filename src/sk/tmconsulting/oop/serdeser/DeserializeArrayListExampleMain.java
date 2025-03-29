package sk.tmconsulting.oop.serdeser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeArrayListExampleMain {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("people.obj");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            ArrayList<Person> people = (ArrayList<Person>) in.readObject();

            in.close();
            fileIn.close();

            for (Person person: people) {
                person.display();
            }
            System.out.println("Objekt bol deserializovaný:");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

