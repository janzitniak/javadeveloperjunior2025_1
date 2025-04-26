package sk.tmconsulting.debugging;

public class VypocetPriemeruZPola {
    public static void main(String[] args) {
        int[] cisla = {5, 10, 15, 20, 25};

        double priemer = vypocitajPriemer(cisla);

        System.out.println("Priemer je: " + priemer);
    }

    public static double vypocitajPriemer(int[] pole) {
        int suma = 0;

        for (int i = 0; i < pole.length; i++) {
            suma += pole[i];
        }

        return (double) suma / pole.length;
    }
}
