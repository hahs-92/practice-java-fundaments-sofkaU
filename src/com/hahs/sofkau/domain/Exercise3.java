package com.hahs.sofkau.domain;

/*
    Haz una aplicación que calcule el área de un círculo(pi*R2).
     El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
      Usa la constante PI y el método pow de Math.
 */
public class Exercise3 {
    public double radio;

    public Exercise3(double radio) {
        this.radio = radio;
    }

    public double calculateArea( ) {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
