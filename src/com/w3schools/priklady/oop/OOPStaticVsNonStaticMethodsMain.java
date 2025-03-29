package com.w3schools.priklady.oop;

public class OOPStaticVsNonStaticMethodsMain {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public void myPublishMethod2() {
        System.out.println("Public methods must be called by creating objects 2");
    }
    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        OOPStaticVsNonStaticMethodsMain myObj = new OOPStaticVsNonStaticMethodsMain(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
        myObj.myPublishMethod2(); // Call the public method on the object 2

/*        new OOPStaticVsNonStaticMethodsMain().myPublicMethod();
        new OOPStaticVsNonStaticMethodsMain().myPublishMethod2();*/
    }
}
