package sk.tmconsulting.ulohy;

public class Matrix1Main {
    public static void main(String[] args) {
        // TODO Ako vypisat hodnoty od 1 do 100, aby v prvom riadku vypisalo od 1 do 10, v druhom od 11 do 20, v tretom od 21 do 30, atd.
        System.out.println("\nAko vypisať hodnoty od 1 do 100, aby v prvom riadku vypísalo od 1 do 10, v druhom od 11 do 20, v treťom od 21 do 30, atď.");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) System.out.println();
        }

        System.out.println("\nPodobná úloha ako vyššie s využitim 2 cyklov, resp. vnoreného.");
        // Podobna uloha ako vyssie s vyuzitim 2 cyklov, resp. vnoreneho
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((10 * i + j) + " ");
            }
            System.out.println();
        }
    }
}
