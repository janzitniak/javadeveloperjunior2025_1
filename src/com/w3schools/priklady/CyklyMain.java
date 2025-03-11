package com.w3schools.priklady;

public class CyklyMain {
    public static void main(String[] args) {

        // Vypise hodnoty od 0 do 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println(); // Prazdny riadok

        // Vypise parne hodnoty do 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }


        // Vnaranie cyklov
        // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop, najprv sa dokonci vnutorny (inner) cyklus (loop) a az potom sa vrati spat do vonkajsieho (outer)
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        System.out.println(); // Prazdny riadok

        // Inicializacia pola cars s naplnenim konkretnych hodnot jednotlivych znaciek automobiliek
        String[] automobilky = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String automobilka : automobilky) {
            System.out.println(automobilka);
        }

        System.out.println(); // Prazdny riadok

        for (int i = 0; i <= 100; i += 10) { // i +=10 je vlastne to iste ako by sme napisali i = i + 10
            System.out.println(i);
        }


        System.out.println();
        int number = 2;
        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " + " + i + " = " + (number + i));
        }

    }
}
