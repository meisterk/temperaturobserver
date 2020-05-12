package de.kohnlehome;

public class CelsiusView implements Observer{
    private TemperaturModel temperaturModel;

    public CelsiusView(TemperaturModel temperaturModel) {
        this.temperaturModel = temperaturModel;
        this.temperaturModel.attach(this);
    }

    @Override
    public void update() {
        double temperaturInKelvin = temperaturModel.getTemperaturInKelvin();
        double temperaturInCelsius = temperaturInKelvin - 273.15;
        String text = String.format("Temperatur: %.1f°C", temperaturInCelsius);
        System.out.println(text);
    }
}
