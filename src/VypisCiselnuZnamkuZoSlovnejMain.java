/*TODO Popis programu.
     Ako bude program fungovať z pohľadu používateľa: Program ho vyzve otázkou: “Zadaj známku slovne (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Program bude od používateľa čakať textovú odpoveď v “konzole”. Odpoveď bude adekvátna číselnej známke - tú program vypíše.
     Program bude ďalej pokračovať vypísaním otázky na zadanie slovnej známky, kým používateľ nepreruší program zadaním slova: koniec
     Program po zadaní koniec ukončí svoju činnosť a vypíše: KONIEC PROGRAMU
     Bonus: Ošetriť diakritiku, čiže program, aby fungoval aj s textom bez makcenov a dlznov
     Bonus č.2: Farebne vypísať známky, 1 - zelená, 2 - žltá, 3 - oranžová, 4 - bordová, 5 - červená!
     Kontrola: 10:50
*/

import java.util.Scanner;

public class VypisCiselnuZnamkuZoSlovnejMain {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in); // Inicializacia vstupného scannera
        String slovnaZnamka = ""; // "" dve prazdne uvodzovky (prazdny retazec) reprezentuje prazdny text

        while (true) { // výraz true sposobi "nekonecny" cyklus
            System.out.println("Zadaj slovnú známku (výborný, chválitebný, dobrý, dostatočný, nedostatočný). Príkaz 'koniec' skončí program!");
            slovnaZnamka = scr.nextLine();

            if (slovnaZnamka.equals("výborný")) {
                System.out.println(1);
            } else if (slovnaZnamka.equals("chválitebný")) {
                System.out.println(2);
            } else if (slovnaZnamka.equals("dobrý")) {
                System.out.println(3);
            } else if (slovnaZnamka.equals("koniec")) {
                System.out.println("KONIEC PROGRAMU");
                break;
            } else {
                System.out.println("Zadal si niečo iné!");
            }
        }

    }
}
