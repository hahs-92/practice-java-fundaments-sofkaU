package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise1And2;

import java.util.Scanner;

public class TestExercises1And2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        var number1 = 0;
        var number2 = 0;

        //pedir datos al usuario
        System.out.println("ingrese el primer numero: ");
        number1 = Integer.parseInt(input.nextLine());
        System.out.println("ingrese el segundo numero: ");
        number2 = Integer.parseInt(input.nextLine());

        Exercise1And2 ex1 = new Exercise1And2(number1, number2);
        ex1.oldestNumber();
    }
}
