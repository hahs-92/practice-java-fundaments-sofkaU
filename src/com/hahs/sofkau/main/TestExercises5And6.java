package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise5And6;

public class TestExercises5And6 {
    public static void main(String[] args) {
        Exercise5And6 ex5 = new Exercise5And6();

        System.out.println("using while while");
        ex5.printEvenAndOddNumberWithWhile();

        System.out.println("-----------------------------------");

        System.out.println("using for");
        ex5.printEvenAndOddNumberWithFor();
    }
}
