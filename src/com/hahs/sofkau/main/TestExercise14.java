package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise14;

import java.util.Scanner;

/*
    Crear un programa que pida un numero por teclado y que imprima por pantalla
     los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 */
public class TestExercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise14 ex = new Exercise14();

        //pedir datos
        System.out.println("Ingrese un numero menor a 1000:");
        int number = Integer.parseInt(input.nextLine());
        ex.iterateNumber(number);
    }
}
