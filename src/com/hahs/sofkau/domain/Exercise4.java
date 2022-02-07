package com.hahs.sofkau.domain;

import java.util.function.Consumer;
import java.util.function.Function;

/*
    Lee un número por teclado que pida el precio de un producto (puede tener decimales)
    y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class Exercise4 {
    public static final double IVA = 0.21;

    /**
     * Calcula el iva(21%) de un producto dado
     * @param valorProduct valor a calcular el iva
     */
    public Function<Double, Double>calculateIva = (valorProduct) -> valorProduct * IVA;

}
