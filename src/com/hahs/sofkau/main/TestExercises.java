package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise1;

public class TestExercises {
    public static void main(String[] args) {
        var number1 = 6;
        var number2 = 8;
        Exercise1 ex1 = new Exercise1(number1, number2);
        ex1.oldestNumber();
    }
}
