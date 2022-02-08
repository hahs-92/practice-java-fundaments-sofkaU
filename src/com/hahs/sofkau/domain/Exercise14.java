package com.hahs.sofkau.domain;

/*
    Crear un programa que pida un numero por teclado y que imprima por pantalla
    los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 */
public class Exercise14 {

    public void iterateNumber(int number) {
        while (number <= 1000) {
            System.out.println(number);
            number += 2;
        }
    }
}
