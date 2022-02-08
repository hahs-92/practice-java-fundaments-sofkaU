package com.hahs.sofkau.domain;

/*
    Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas
     las a del String anterior por una e, adicionalmente concatenar a esta frase
      una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
 */

@FunctionalInterface
public interface Exercise9 {
    String replaceWords(String sentence, String oldChar, String newChart);

    /**
     * Reemplaza los caracteres a por e de una oracion y concatena una nueva frase
     * @param anotherSentence
     * @param sentence
     * @param oldChar caracter a reemplazar
     * @param newChart caracter utilizado para reemplazar a otro
     */
    default void concatSentences(String anotherSentence,String sentence, String oldChar, String newChart) {
        String newSentence = replaceWords(sentence,oldChar, newChart);
        System.out.println(newSentence.concat(" " + anotherSentence));
    }

}
