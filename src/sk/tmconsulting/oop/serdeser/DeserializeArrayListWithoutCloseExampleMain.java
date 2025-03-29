package sk.tmconsulting.oop.serdeser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DeserializeArrayListWithoutCloseExampleMain {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("people.obj");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            Object obj = in.readObject(); // Nacita ArrayList ako object

            if (obj instanceof ArrayList<?>) { // Robime kontrolu, ci nacitany objekt je typu ArrayList
                List<?> rawList = (List<?>) obj; // Resp. vytvorime dynamicke pole rawList, v ktorom bude nacitany obsah, t.j. zatial obj, ale tymto ho prekonvertujeme na (Array)List

                List<Person> people = new ArrayList<>(); // Vytvorime prazdny zoznam (dynamicke pole) s people
                for (Object item : rawList) { // Prechadzame (foreach) jednotlivymi polozkami rawList
                    if (item instanceof Person) { // A ak ta polozka je typu (instanceof) Person, tak ju pridame do zoznamu ludi
                        people.add((Person) item);
                    } else { // A ak nie, tak vypisme o tom hlasku.
                        System.out.println("Objekt v zozname nie je typu Person: " + item.getClass().getName());
                    }
                }

                for (Person person : people) {
                    person.display();
                }

                System.out.println("Objekt bol bezpečne deserializovaný.");
            } else {
                System.out.println("Deserializovaný objekt nie je zoznam.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
