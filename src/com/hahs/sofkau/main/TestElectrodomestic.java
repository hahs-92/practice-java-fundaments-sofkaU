package com.hahs.sofkau.main;

import com.hahs.sofkau.domain.Electrodomestic;
import com.hahs.sofkau.domain.Tv;
import com.hahs.sofkau.domain.WashingMachine;


public class TestElectrodomestic {
    public static void main(String[] args) {
        Electrodomestic[] electrodomestics = {
                new Electrodomestic(100, "blue",'F',120),
                new WashingMachine(120, "white",'A',150,60),
                new WashingMachine(100, "gray",'C',80,30),
                new WashingMachine(80, "red",'B',100,30),
                new WashingMachine(100, "black",'E',70,20),
                new Tv(100, "red", 'A',10,60,false),
                new Tv(150, "red", 'A',25,80,true),
                new Tv(70, "black", 'F',10,32,false),
                new Tv(180, "blue", 'B',30,50,true),
                new Tv(100, "black", 'E',10,24,true)
        };

        double allTvsPrice = 0;
        double allWashingMachinesPrice = 0;
        double allElectromesticsPrice = 0;

        for (int i = 0; i < electrodomestics.length; i++) {
            if(electrodomestics[i] instanceof Tv) {
                allTvsPrice += electrodomestics[i].getPrice();
            } else if(electrodomestics[i] instanceof WashingMachine) {
                allWashingMachinesPrice += electrodomestics[i].getPrice();
            } else if(electrodomestics[i] instanceof Electrodomestic) {
                allElectromesticsPrice += electrodomestics[i].getPrice();
            }
        }

        System.out.println("El precio total de las lavadoras es: " + allWashingMachinesPrice);
        System.out.println("El precio total de los Televisores es: " + allTvsPrice);
        System.out.println("El precio total de los Electrodomesticos es: " + allElectromesticsPrice);
        System.out.println("El precio total de todos los Electrodomesticos es: " +
                ( allElectromesticsPrice +  allTvsPrice + allWashingMachinesPrice)
        );
    }

}
