package com.hahs.sofkau.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Realizar la construcción de un algoritmo que permita de acuerdo a una frase
    pasada por consola, indicar cual es la longitud de esta frase,
    adicionalmente cuantas vocales tiene de “a,e,i,o,u”.
 */

public class Exercise11 {

    String [] vowels = {"a", "e", "i", "o", "u"};

    public int calculateLength(String sentence) {
      return  sentence.length();
    }

    /**
     * Calcula cuantas veces esta una vocal en una oracion
     * @param sentence
     * @param vowel
     * @return
     */
    public int countVowelInString(String sentence, String vowel) {
        List<String> mySentence = new ArrayList<>(Arrays.asList(sentence.split("")));
        String countVowels = "";

        countVowels = mySentence.stream().reduce("", (acum, v) -> {
                    if(v.equalsIgnoreCase(vowel)) {
                        return  acum + v;
                    }
                    return  acum;
                });
        return  countVowels.length();
    }

    public void calculateLengthAndCountVowels(String sentence) {
        System.out.println("Esta frase tiene una longitud de : " + this.calculateLength(sentence) );

        int countVowels = 0;
        for (int i = 0; i < this.vowels.length; i++) {
            countVowels = this.countVowelInString(sentence, this.vowels[i]);
            System.out.println(this.vowels[i] + ":" +  countVowels);
        }
    }
}


