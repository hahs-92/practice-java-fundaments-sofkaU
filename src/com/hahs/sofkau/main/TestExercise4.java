package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise4;

import java.util.Scanner;

public class TestExercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise4 ex4 = new Exercise4();

        //pedir datos
        System.out.println("Ingrese el valor del product: ");
        double productValue = Double.parseDouble(input.nextLine());

        double productIva = ex4.calculateIva.apply(productValue);

        System.out.println("valor del producto sin iva: " + productValue);
        System.out.println("iva del producto = " + productIva);
        System.out.println("producto con iva incluido = " +( productIva + productValue));
    }
}
