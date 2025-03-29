package sk.tmconsulting.oop;

public class AutoEnkapsulaciaMain {
    public static void main(String[] args) {
        AutoEnkapsulacia auto1 = new AutoEnkapsulacia();
        auto1.setZnacka("Škoda");
        auto1.setRokVyroby(2020);

        System.out.println(auto1.getZnacka());
        System.out.println(auto1.getRokVyroby());
    }
}
