package com.hahs.sofkau.domain;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;


public class Electrodomestic {
    protected  double price;
    protected final String color; // black,red, blue, gray
    protected final Character energyConsumption; // A - F
    protected final double weight;

    final Character[] listOfRefEnergyConsumption = { 'A', 'B', 'C', 'D', 'E', 'F'};
    final String[] validColors  = { "WHITE","BLACK","RED", "BLUE", "GRAY"};

    public Electrodomestic() {
        this.price = 100;
        this.color = validColors[0];
        this.energyConsumption = listOfRefEnergyConsumption[5];
        this.weight = 5;
    }

    public Electrodomestic(double price, double weight) {
        this.price = price;
        this.weight = weight;
        this.color = validColors[0];
        this.energyConsumption = listOfRefEnergyConsumption[5];
    }

    public Electrodomestic(double price, String color, Character energyConsumption, double weight) {
        this.price = price;
        this.color = this.checkColor(color);
        this.energyConsumption = this.checkEnergyConsumption(energyConsumption);
        this.weight = weight;
    }


    public String getColor() {
        return color;
    }

    public Character getEnergyConsumption() {
        return energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return this.finalPrice();
    }

    //methods

    /**
     * Comprueba si el caracter de energyConsumption es valido, de lo contrario le asigna el caracter 'F
     * @param energyConsumption
     * @return
     */
    private Character checkEnergyConsumption(Character energyConsumption) {
        boolean isEmpty  = Arrays.stream(this.listOfRefEnergyConsumption).filter(c -> c.equals(energyConsumption))
                .collect(Collectors.toList())
                .isEmpty();

        return  (isEmpty) ? this.listOfRefEnergyConsumption[5] : energyConsumption;
    }

    /**
     * Comprueba que el color sea valido, de lo contrario lo asigna a "white"
     * @param color
     * @return
     */
    private String checkColor(String color) {
        boolean isEmpty = Arrays.stream(this.validColors).filter(c -> c.equalsIgnoreCase(color))
                .collect(Collectors.toList())
                .isEmpty();
        return (isEmpty) ? this.validColors[0] : color.toUpperCase();
    }

    /**
     * Calcula el precio del electrodomestico, de acuerdo a su precio base mas el incremento por peso y consumo de energia
     * @return
     */
    protected double finalPrice() {
        return this.price + this.calculateIncrementPriceByWeight(this.weight) + this.calculateIncrementByEneryConsumption(this.energyConsumption);
    }

    /**
     * Calcula el incremento al precio del electrodomestico de acuerdo a su consumo de energia
     * @param energyConsumption
     * @return
     */
    private double calculateIncrementByEneryConsumption(Character energyConsumption) {
        Map<String, Integer> refPriceByEnergyConsumption =
                Map.of("A",100, "B", 80, "C",60, "D", 50, "E", 30, "F", 10);
        return  refPriceByEnergyConsumption.get(energyConsumption.toString());
    }

    /**
     *  Calcula el incremento al precio del electrodomestico de acuerdo a su peso
     * @param weight
     * @return
     */
    private double calculateIncrementPriceByWeight(double weight) {
        double increment;
        if(weight < 19) {
            increment = 10;
        } else if(weight > 19 && weight < 50) {
            increment = 50;
        } else if(weight >= 50 && weight < 80) {
            increment = 80;
        } else {
            increment = 100;
        }
        return increment;
    }


}
