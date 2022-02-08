package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise9;

import java.util.Scanner;

public class TestExercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String initialSentence = "La sonrisa sera la mejor arma contra la tristeza";

        Exercise9 ex = (sentence, oldChar, newChart) -> sentence.replace(oldChar, newChart);

        //pedir datos
        System.out.println("Ingresa una frase");
        String userSentence = input.nextLine();

        ex.concatSentences( userSentence,initialSentence, "a", "e");

    }
}
