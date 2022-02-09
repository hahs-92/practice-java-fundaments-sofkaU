package com.hahs.sofkau.domain;

import java.util.Scanner;

/*
    Hacer un programa que muestre el siguiente menú de opciones
    ****** GESTION CINEMATOGRÁFICA ********
    1-NUEVO ACTOR
    2-BUSCAR ACTOR
    3-ELIMINAR ACTOR
    4-MODIFICAR ACTOR
    5-VER TODOS LOS ACTORES
    6- VER PELICULAS DE LOS ACTORES

    7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
    8-SALIR


    EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE
    UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN
    NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO".
     Y MOSTRAR EL MENU NUEVAMENTE.
    PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
 */
public class Exercise15 {

    Scanner input = new Scanner(System.in);

    public void showMenu() {
        System.out.println(
                "****** GESTION CINEMATOGRÁFICA ******** \n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR"
        );
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void menuController(String option) {
        switch (option) {
            case "1":
                showMessage("Nuevo actor seleccionado");
                break;
            case "2":
                showMessage("Buscar actor seleccionado");
                break;
            case "3":
                showMessage("Eliminar actor seleccionado");
                break;
            case "4":
                showMessage("Modificar actor seleccionado");
                break;
            case "5":
                showMessage("Ver todos los actores");
                break;
            case "6":
                showMessage("Ver pelicula de los actores");
                break;
            case "7":
                showMessage("Ver categoria de las peliculas de los actores");
                break;
            case "8":
                showMessage("Adios XD");
                break;
            default:
                showMessage("Opcion Incorrecta, intentalo de nuevo");
                break;
        }
    }

    public String requestOption() {
        System.out.println("ingrese una Opcion:");
        String userOption = input.nextLine();
        return  userOption;
    }

    public void cineInterface() {
        String userOption = "";
        do {
            showMenu();
            userOption = requestOption();
            menuController(userOption);
        } while (!userOption.equals("8"));

    }

}
