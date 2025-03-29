package sk.tmconsulting.oop;
//TODO Rozdel triedu Auto na: Auto a VyrobaAut. Zhodnotenie: 20:00
public class Auto {
    // Premenné triedy
    String znacka;
    int rokVyroby;

    // Predvolený konštruktor (bez parametrov)
    public Auto() {
        znacka = "Neznáma";
        rokVyroby = 0;
    }

    // Konštruktor s parametrami
    public Auto(String znacka, int rokVyroby) {
        this.znacka = znacka;
        this.rokVyroby = rokVyroby;
    }

    // Metóda na zobrazenie údajov o aute
    public void zobrazInfo() {
        System.out.println("Značka: " + znacka);
        System.out.println("Rok výroby: " + rokVyroby);
    }

    // Hlavná metóda
    public static void main(String[] args) {
        // Vytvorenie objektu pomocou predvoleného konštruktora
        Auto auto1 = new Auto();
        auto1.zobrazInfo();

        System.out.println();

        // Vytvorenie objektu pomocou konštruktora s parametrami
        Auto auto2 = new Auto("Toyota", 2015);
        auto2.zobrazInfo();
    }
}

