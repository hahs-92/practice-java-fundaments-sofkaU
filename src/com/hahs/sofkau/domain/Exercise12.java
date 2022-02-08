package com.hahs.sofkau.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
    Pedir dos palabras por teclado, indicar si son iguales,
    sino son iguales mostrar sus diferencias.
 */
public class Exercise12 {

    public void findDifferences(String word1, String word2) {
        String words = word1.concat(word2);
        String differences = "";

        for (int i = 0; i < words.length(); i++) {
            if(word1.contains(String.valueOf(words.charAt(i)))) {
                if(!word2.contains(String.valueOf(words.charAt(i)))) {
                    differences += words.charAt(i);
                }
            } else if(word2.contains(String.valueOf(words.charAt(i)))){
                if(!word1.contains(String.valueOf(words.charAt(i)))) {
                    differences += words.charAt(i);
                }
            }
        }
        System.out.println("differences = " + differences);
    }

    public void isEquals(String word1, String word2) {
        if(word1.equalsIgnoreCase(word2)) {
            System.out.println("Las dos palabras son iguales");
        } else {
            findDifferences(word1,word2);
        }
    }

}
