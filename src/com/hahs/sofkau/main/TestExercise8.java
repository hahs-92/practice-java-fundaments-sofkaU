package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise8;

import java.util.Scanner;

public class TestExercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise8 ex = new Exercise8();

        //pedir datos
        System.out.println("Ingresa un dia de la semana: ");
        String day = input.nextLine();

        ex.isALaboralDay(day);
    }
}
