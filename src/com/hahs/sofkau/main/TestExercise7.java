package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise7;

import java.util.Scanner;

public class TestExercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise7 ex7 = new Exercise7();

        boolean isLowerToZero = true;

        //bucle
        do {
            //pedir datos usuario
            System.out.println("Ingrese un Numero: ");
            int number = Integer.parseInt(input.nextLine());

            isLowerToZero = ex7.isOlderToZeroOrEqual.test(number);
        } while(!isLowerToZero);


    }
}
