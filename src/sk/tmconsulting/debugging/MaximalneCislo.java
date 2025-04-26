package sk.tmconsulting.debugging;

public class MaximalneCislo {
    public static void main(String[] args) {
        int a = 12;
        int b = 20;

        int max = najdiVacsieCislo(a, b);

        System.out.println("Väčšie číslo je: " + max);
    }

    public static int najdiVacsieCislo(int x, int y) {
        if (x > y) {
            return x;
        } else if (x < y) {
            return y;
        } else {
            System.out.println("Čísla sú rovnaké.");
            return x; // alebo y, je to jedno
        }
    }
}

