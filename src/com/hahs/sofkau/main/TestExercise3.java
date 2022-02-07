package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise3;

import java.util.Scanner;

public class TestExercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //pedir datos usuario
        System.out.println("Ingrese el radio del circulo: ");
        double radio = Double.parseDouble(input.nextLine());


        Exercise3 ex3 = new Exercise3(radio);
        double circleArea =  ex3.calculateArea();
        System.out.println("circleArea = " + circleArea);
    }
}
