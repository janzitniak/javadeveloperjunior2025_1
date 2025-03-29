package sk.tmconsulting.oop;

public class TeplomerException {
    private double teplotaC;

    public TeplomerException(double teplotaC) {
        setTeplotaC(teplotaC);
    }

    public void setTeplotaC(double teplotaC) {
        if (teplotaC < -100 || teplotaC > 100) {
            throw new IllegalArgumentException("Zadaná teplota je mimo rozsahu (-100 až 100°C).");
        }
        this.teplotaC = teplotaC;
    }

    public double getTeplotaC() {
        return teplotaC;
    }

    public double getTeplotaF() {
        return teplotaC * 9 / 5 + 32;
    }

    public void zobrazTeplotu() {
        System.out.println("Teplota: " + teplotaC + " °C");
        System.out.println("Teplota: " + getTeplotaF() + " °F");
    }

    public static void main(String[] args) {
        try {
            TeplomerException t1 = new TeplomerException(22.0);
            t1.zobrazTeplotu();
            System.out.println();
            t1.setTeplotaC(-150); // Výnimka!
        } catch (IllegalArgumentException e) {
            System.out.println("Chyba: " + e.getMessage());
        }

        System.out.println();

        try {
            TeplomerException t2 = new TeplomerException(10);
            t2.setTeplotaC(35.5);
            t2.zobrazTeplotu();
        } catch (IllegalArgumentException e) {
            System.out.println("Chyba: " + e.getMessage());
        }
    }
}

