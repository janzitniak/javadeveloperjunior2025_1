public class Main {
    public static void main(String[] args) {
        String name = "Juraj";
        String celeMeno = "Ján Žitniak";
        String firma = "Oracle Inc.";
        int vek = 45;

        System.out.println("ZMENA V PROGRAME");

        System.out.println("Hello World");
        System.out.println(celeMeno + " pracuje v spoločnosti " + firma + " a má " + vek + " rokov.");
        System.out.println("TM Consulting s.r.o.");
        System.out.print("Ahoj");
        System.out.println(" svet!");
        System.out.println(); // Vlozi / zobrazi prazdny riadok
        System.out.println();
        // Dalsi riadok vypise cislo 3
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        /* Viacriadkovy komentar
        pokracujem v druhom riadku a takto mozem pisat viacero riadkov, ktore su stale
        komentarmi
         */

        System.out.println(name);

        int myNum;
        myNum = 20;
        System.out.println(myNum);

        final float dph = 0.23f; // vytvorili (zadefinovali) sme konstantu s nazvom dph

        // dph = 0.20f;
        System.out.println("Hodnota DPH je " + dph);

    }
}
