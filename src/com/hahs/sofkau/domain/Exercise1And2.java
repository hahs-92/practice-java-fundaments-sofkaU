package com.hahs.sofkau.domain;

/*
 Declara 2 variables numéricas (con el valor que desees),
 he indica cual es mayor de los dos. Si son iguales
  indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */

/*
    Al ejercicio anterior agregar entrada por consola de dos valores e indicar
     si son mayores, menores o iguales.
 */
public class Exercise1And2 {
    public int variable1;
    public int variable2;

    public Exercise1And2(int variable1, int variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    /**
     * Determina si un numero es mayor que otro, o si son iguales
     */
    public void oldestNumber() {
        if(variable1 == variable2) {
            System.out.println("El numero: " + variable1 + " es igual al numero: " + variable2);
        } else if(variable1 > variable2) {
            System.out.println("El numero: " + variable1 + " es mayor al numero: " + variable2);
        } else {
            System.out.println("El numero: " + variable1 + " es menor al numero: " + variable2);
        }
    }




}
