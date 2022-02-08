package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise11;

import java.util.Scanner;

public class TestExercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise11 ex = new Exercise11();

        //pedir datos
        System.out.println("Ingrese una frase: ");
        String sentence = input.nextLine();
        ex.calculateLengthAndCountVowels(sentence);
    }
}
