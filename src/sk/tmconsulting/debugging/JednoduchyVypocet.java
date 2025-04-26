package sk.tmconsulting.debugging;

public class JednoduchyVypocet {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        vypocitajASpravVystup(a, b, c);
    }

    public static void vypocitajASpravVystup(int x, int y, int z) {
        int sum = x + y + z;
        double average = sum / 3.0;

        System.out.println("Súčet: " + sum);
        System.out.println("Priemer: " + average);
    }
}
