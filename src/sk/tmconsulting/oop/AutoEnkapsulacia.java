package sk.tmconsulting.oop;

public class AutoEnkapsulacia {
    private String znacka;
    private int rokVyroby;

    public AutoEnkapsulacia() {
        znacka = "Toyota";
        rokVyroby = 2025;
    }

    public AutoEnkapsulacia(String znacka, int rokVyroby) {
        this.znacka = znacka;
        this.rokVyroby = rokVyroby;
    }

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
        // ak je značka neznáma, nastavíme aj rok výroby na 0
        if (znacka.equals("Neznáma")) {
            this.rokVyroby = 0;
        }
    }


    public int getRokVyroby() {
        return rokVyroby;
    }

    public void setRokVyroby(int rokVyroby) {
        if (rokVyroby > 1885 && rokVyroby <= 2025) { // prvé auto vzniklo v roku 1886
            this.rokVyroby = rokVyroby;
        } else {
            System.out.println("Neplatný rok výroby.");
        }
    }

}
