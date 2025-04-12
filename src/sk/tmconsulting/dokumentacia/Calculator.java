package sk.tmconsulting.dokumentacia;

/**
 * Trieda Calculator poskytuje jednoduché matematické operácie.
 *
 * @author Jan
 * @version 1.0
 */
public class Calculator {

    /**
     * Sčíta dve celé čísla.
     *
     * @param a Prvé číslo
     * @param b Druhé číslo
     * @return Súčet čísiel a + b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Odčíta druhé číslo od prvého.
     *
     * @param a Prvé číslo
     * @param b Druhé číslo
     * @return Rozdiel a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Vynásobí dve čísla.
     *
     * @param a Prvé číslo
     * @param b Druhé číslo
     * @return Súčin a * b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Vydelí prvé číslo druhým.
     *
     * @param a Čitateľ
     * @param b Menovateľ
     * @return Podiel a / b
     * @throws ArithmeticException ak sa b rovná 0
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Delenie nulou nie je povolené.");
        }
        return a / b;
    }
}
