package com.hahs.sofkau.domain;


public class WashingMachine extends Electrodomestic{
    private final double load;

    public WashingMachine() {
        this.load = 5;
    }

    public WashingMachine(double price, double weight) {
        super(price, weight);
        this.load = 5;
    }

    public WashingMachine(double price, String color, Character energyConsumption, double weight, double load) {
        super(price, color, energyConsumption, weight);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    @Override
    /**
     * Calcula el precio final de electrodomestico de acuerdo a su precio base,
     * mas los incrementos  por peso, consumo de energia y carga
     */
    protected double finalPrice() {
        double increment = 0;
        if(this.load > 30) {
            increment = 50;
        }
        return super.finalPrice() + increment;
    }
}
