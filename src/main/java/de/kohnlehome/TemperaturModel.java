package de.kohnlehome;

import java.util.Random;

public class TemperaturModel extends Subject{
    private double temperaturInKelvin;
    private Random random;

    public TemperaturModel() {
        random = new Random();
        temperaturAendern();
    }

    public void temperaturAendern(){
        this.temperaturInKelvin = random.nextDouble()*1000.0;
        notifyObservers();
    }

    public double getTemperaturInKelvin() {
        return temperaturInKelvin;
    }
}
