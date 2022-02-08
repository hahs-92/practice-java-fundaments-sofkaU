package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise10;

import java.util.Scanner;

public class TestExercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise10 ex = new Exercise10();

        //pedir datos
        System.out.println("Ingrese una frase:");
        String sentence = input.nextLine();

        System.out.println(ex.deleteBlankSpaces.apply(sentence));
    }
}
