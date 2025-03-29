package sk.tmconsulting.oop;

public class AutoEnkapsulaciaMain {
    public static void main(String[] args) {
        AutoEnkapsulacia auto1 = new AutoEnkapsulacia();
        System.out.println(auto1.getZnacka());
        System.out.println(auto1.getRokVyroby());

        System.out.println("Naplnil som atribúty auta konkrétnymi údajmi:");
        auto1.setZnacka("Škoda");
        auto1.setRokVyroby(1800);

        System.out.println(auto1.getZnacka());
        System.out.println(auto1.getRokVyroby());

        System.out.println("Ďalšie auto č.2:");
        AutoEnkapsulacia auto2 = new AutoEnkapsulacia();
        System.out.println(auto2.getZnacka());
        System.out.println(auto2.getRokVyroby());

        auto2.setZnacka("Neznáma");
        System.out.println(auto2.getZnacka());
        System.out.println(auto2.getRokVyroby());
    }
}
