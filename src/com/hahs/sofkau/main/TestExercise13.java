package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Exercise13;

public class TestExercise13 {
    public static void main(String[] args) {
        Exercise13 ex = new Exercise13();

        String currentDate = ex.getCurrentDate();
        System.out.println("currentDate = " + currentDate);
    }
}
