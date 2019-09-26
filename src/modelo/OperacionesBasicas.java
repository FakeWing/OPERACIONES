/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fake Wings
 */
public class OperacionesBasicas {

    private int a, b;

    public OperacionesBasicas(int a, int b) {
        this.a = a;
        this.b = b;
    }

    OperacionesBasicas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int sumar() {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return a + b;
        }
    }

    public int restar() {
        if (b > a) {
            return 0;
        } else {
            return a - b;
        }
    }

    public int multiplicar() {
        if (b == 0) {
            return 1;
        } else {
            return a * b;
        }
    }

    public int dividir() {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }

    }

}
