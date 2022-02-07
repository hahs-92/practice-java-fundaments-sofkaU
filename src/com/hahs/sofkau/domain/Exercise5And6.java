package com.hahs.sofkau.domain;

/*
    5 = Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
    6 =Realiza el ejercicio anterior usando un ciclo for.
 */
public class Exercise5And6 {

    public void printEvenAndOddNumberWithWhile() {
        var index = 0;
        while(index <= 100) {
            if(index % 2 == 0) {
                System.out.println("par: " + index);
            } else {
                System.out.println("impar: " + index);
            }
            index++;
        }
    }

    public void printEvenAndOddNumberWithFor() {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0) {
                System.out.println("par: " + i);
            } else {
                System.out.println("impar: " + i);
            }
        }
    }
}
