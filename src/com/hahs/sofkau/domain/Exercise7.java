package com.hahs.sofkau.domain;

import java.util.function.Predicate;

/*
    Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
    si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */
public class Exercise7 {

    /**
     * Calcula si un numero es mayor o igual a 0
     * @param number numero a determinar si es mayor o igual a zero
     */
    public Predicate<Integer> isOlderToZeroOrEqual = number -> number >= 0;
}
