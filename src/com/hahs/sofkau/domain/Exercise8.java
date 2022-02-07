package com.hahs.sofkau.domain;

/*
    Crea una aplicación por consola que nos pida un día de la semana
    y que nos diga si es un día laboral o no. Usa un switch para ello.
 */
public class Exercise8 {

    /**
     * Determina si un dia es un dia laboral
     * @param day Dia de la semana
     */
    public void isALaboralDay (String day) {
        switch (day.toUpperCase()) {
            case "SABADO":
            case "DOMINGO":
                System.out.println("El dia " + day + " No es un dia Laboral XD");
                break;
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("El dia " + day + " es un dia laboral X(");
                break;
            default:
                System.out.println( day + "No es un dia de la semana X0");
                break;
        }
    }
}
