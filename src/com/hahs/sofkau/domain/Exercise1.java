package com.hahs.sofkau.domain;

/*
 Declara 2 variables numéricas (con el valor que desees),
 he indica cual es mayor de los dos. Si son iguales
  indicarlo también. Ve cambiando los valores para comprobar que funciona.
 */
public class Exercise1 {
    public int variable1;
    public int variable2;

    public Exercise1(int variable1, int variable) {
        this.variable1 = variable1;
        this.variable2 = variable;
    }

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
