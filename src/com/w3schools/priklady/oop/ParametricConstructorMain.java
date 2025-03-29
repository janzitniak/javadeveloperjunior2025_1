package com.w3schools.priklady.oop;

public class ParametricConstructorMain {
    int x;

    public ParametricConstructorMain(int x) {
        this.x = x; // thix.x sa odkazuje na premennu (atribut) triedy, obycajne x je vlastne parameter metody
    }

    public static void main(String[] args) {
        ParametricConstructorMain myObj = new ParametricConstructorMain(5);
        System.out.println(myObj.x);
    }
}
