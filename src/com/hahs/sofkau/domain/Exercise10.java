package com.hahs.sofkau.domain;

import java.util.function.UnaryOperator;

/*
    Realizar una aplicación de consola, que al ingresar una frase por teclado elimine
     los espacios que esta contenga.
 */
public class Exercise10 {

    public UnaryOperator<String> deleteBlankSpaces = (sentence -> sentence
            .replace(" ", ""));
}
