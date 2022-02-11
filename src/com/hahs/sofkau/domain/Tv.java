package com.hahs.sofkau.domain;

public class Tv extends Electrodomestic{
    private final double resolution;
    private final boolean freeviewTuner;

    public Tv() {
        this.resolution = 20;
        this.freeviewTuner = false;
    }

    public Tv(double price, double weight) {
        super(price, weight);
        this.resolution = 20;
        this.freeviewTuner = false;
    }

    public Tv(
            double price,
            String color,
            Character energyConsumption,
            double weight,
            double resolution,
            boolean freeviewTuner
    ) {
        super(price, color, energyConsumption, weight);
        this.resolution = resolution;
        this.freeviewTuner = freeviewTuner;
    }

    public double getResolution() {
        return resolution;
    }

    public boolean isFreeviewTuner() {
        return freeviewTuner;
    }


    /**
     *  Calcula el precio final de electrodomestico de acuerdo a su precio base,
     *   mas los incrementos  por peso, consumo de energia , resolucion de la pantalla y su sintonizador
     */
    @Override
    protected double finalPrice() {
        return super.finalPrice() +
                this.calculateIncrementByFreeviewTuner(this.freeviewTuner) +
                this.calculateIncremnetByResolution(this.resolution);
    }

    /**
     * Calcula el incremento del precio del Tv de acuerdo su resolucion de pantalla
     * @param resolution
     * @return
     */
    private double calculateIncremnetByResolution(double resolution) {
        return (resolution > 40) ? this.price * .30 : 0;
    }

    /**
     * Calcula el incremento del precio del Tv de acuerdo a su sintonizador
     * @param freeviewTuner
     * @return
     */
    private double calculateIncrementByFreeviewTuner(boolean freeviewTuner) {
        return (freeviewTuner) ? 50 : 0;
    }
}
