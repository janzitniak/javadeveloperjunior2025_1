package sk.tmconsulting.ulohy;
/*
Úloha č.2: Vytvorte obdobnú maticu, ktorá bude obsahovať 2-násobok tej predchádzajúcej hodnoty (začneme 1), takže bude to vyzerať nasledujúco:
 1  2   4   8   16
32  64  128 256 512
1024 ...
*/

public class Matrix2Main {
    public static void main(String[] args) {
        int cislo = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(cislo + "\t");
                //cislo *= 2;
                cislo = cislo * 2;
            }
            System.out.println();
        }
    }
}
